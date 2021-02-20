package typings.winrtUwp.Windows.Media.Audio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AudioFileNodeCreationStatus extends StObject
/** Defines status values for audio file node creation. */
@JSGlobal("Windows.Media.Audio.AudioFileNodeCreationStatus")
@js.native
object AudioFileNodeCreationStatus extends StObject {
  
  /** The audio file used to create the node was not found. */
  @js.native
  sealed trait fileNotFound extends AudioFileNodeCreationStatus
  
  /** The format of the audio file is not supported. */
  @js.native
  sealed trait formatNotSupported extends AudioFileNodeCreationStatus
  
  /** The audio file for node creation has an invalid file type. */
  @js.native
  sealed trait invalidFileType extends AudioFileNodeCreationStatus
  
  /** Creation of the audio file node succeeded. */
  @js.native
  sealed trait success extends AudioFileNodeCreationStatus
  
  /** An unknown failure occurred during creation of the audio file node. */
  @js.native
  sealed trait unknownFailure extends AudioFileNodeCreationStatus
}
