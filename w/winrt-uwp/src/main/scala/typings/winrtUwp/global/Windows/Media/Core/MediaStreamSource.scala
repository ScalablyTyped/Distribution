package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Media.Core.IMediaStreamDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a media source that delivers media samples directly to the media pipeline. */
@JSGlobal("Windows.Media.Core.MediaStreamSource")
@js.native
class MediaStreamSource protected ()
  extends typings.winrtUwp.Windows.Media.Core.MediaStreamSource {
  /**
    * Creates an instance of MediaStreamSource from the specified IMediaStreamDescriptor .
    * @param descriptor The AudioStreamDescriptor or VideoStreamDescriptor to create the MediaStreamSource from.
    */
  def this(descriptor: IMediaStreamDescriptor) = this()
  /**
    * Creates an instance of MediaStreamSource from two IMediaStreamDescriptor objects.
    * @param descriptor The first AudioStreamDescriptor or VideoStreamDescriptor to create the MediaStreamSource from.
    * @param descriptor2 The second AudioStreamDescriptor or VideoStreamDescriptor to create the MediaStreamSource from.
    */
  def this(descriptor: IMediaStreamDescriptor, descriptor2: IMediaStreamDescriptor) = this()
}
