package typings.winrtUwp.global.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a name-value pair in a URL query string. Use the IWwwFormUrlDecoderEntry interface instead; see Remarks. */
@JSGlobal("Windows.Foundation.WwwFormUrlDecoderEntry")
@js.native
abstract class WwwFormUrlDecoderEntry ()
  extends StObject
     with typings.winrtUwp.Windows.Foundation.WwwFormUrlDecoderEntry {
  
  /** Represents the name of a parameter in a URL query string. Use the IWwwFormUrlDecoderEntry interface version ( IWwwFormUrlDecoderEntry.Name ) instead; see Remarks. */
  /* CompleteClass */
  var name: String = js.native
  
  /** Represents a named value in a URL query string. Use the IWwwFormUrlDecoderEntry interface version ( IWwwFormUrlDecoderEntry.Value ) instead; see Remarks. */
  /* CompleteClass */
  var value: String = js.native
}
