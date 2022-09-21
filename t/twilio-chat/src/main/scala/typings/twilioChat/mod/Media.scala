package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents media information for a message in a channel.
  */
@JSImport("twilio-chat", "Media")
@js.native
open class Media protected () extends StObject {
  /**
    * @internal
    */
  def this(data: MediaState, services: MediaServices) = this()
  
  /**
    * Content type of the media.
    */
  def contentType: String = js.native
  
  /**
    * File name. Null if absent.
    */
  def filename: String = js.native
  
  /**
    * Returns the direct content URL for the media.
    *
    * This URL is impermanent, it will expire in several minutes and cannot be cached.
    * If the URL becomes expired, you need to request a new one.
    * Each call to this function produces a new temporary URL.
    */
  def getContentTemporaryUrl(): js.Promise[String] = js.native
  
  /* private */ var mcsMedia: Any = js.native
  
  /* private */ var services: Any = js.native
  
  /**
    * Server-assigned unique identifier for the media.
    */
  def sid: String = js.native
  
  /**
    * Size of the media in bytes.
    */
  def size: Double = js.native
  
  /* private */ var state: Any = js.native
}
