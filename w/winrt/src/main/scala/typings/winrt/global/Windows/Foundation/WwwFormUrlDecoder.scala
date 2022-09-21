package typings.winrt.global.Windows.Foundation

import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.IWwwFormUrlDecoderEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Foundation.WwwFormUrlDecoder")
@js.native
open class WwwFormUrlDecoder protected ()
  extends StObject
     with typings.winrt.Windows.Foundation.WwwFormUrlDecoder {
  def this(query: String) = this()
  
  /* CompleteClass */
  override def first(): IIterator[IWwwFormUrlDecoderEntry] = js.native
}
