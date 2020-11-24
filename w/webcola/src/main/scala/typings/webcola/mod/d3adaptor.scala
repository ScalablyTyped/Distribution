package typings.webcola.mod

import typings.webcola.d3adaptorMod.D3v3Context
import typings.webcola.d3adaptorMod.ID3StyleLayoutAdaptor
import typings.webcola.d3v4adaptorMod.D3Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "d3adaptor")
@js.native
object d3adaptor extends js.Object {
  
  def apply(): typings.webcola.layoutMod.Layout with ID3StyleLayoutAdaptor = js.native
  def apply(d3Context: D3v3Context): typings.webcola.layoutMod.Layout with ID3StyleLayoutAdaptor = js.native
  def apply(d3Context: D3Context): typings.webcola.layoutMod.Layout with ID3StyleLayoutAdaptor = js.native
}
