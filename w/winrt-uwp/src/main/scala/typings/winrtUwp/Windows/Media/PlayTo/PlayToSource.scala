package typings.winrtUwp.Windows.Media.PlayTo

import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a media element to connect to a Play To target. */
trait PlayToSource extends StObject {
  
  /** Gets the connection to the Play To target. */
  var connection: PlayToConnection
  
  /** Gets or sets the next Play To source element. */
  var next: PlayToSource
  
  /** Connects the next Play To source element to the Play To target. */
  def playNext(): Unit
  
  /** Specifies a preferred Uniform Resource Identifier (URI) for the media stream, such as a cloud based media server, used is used for Play To by reference. */
  var preferredSourceUri: Uri
}
object PlayToSource {
  
  @scala.inline
  def apply(connection: PlayToConnection, next: PlayToSource, playNext: () => Unit, preferredSourceUri: Uri): PlayToSource = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], playNext = js.Any.fromFunction0(playNext), preferredSourceUri = preferredSourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToSource]
  }
  
  @scala.inline
  implicit class PlayToSourceMutableBuilder[Self <: PlayToSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: PlayToConnection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: PlayToSource): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayNext(value: () => Unit): Self = StObject.set(x, "playNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreferredSourceUri(value: Uri): Self = StObject.set(x, "preferredSourceUri", value.asInstanceOf[js.Any])
  }
}
