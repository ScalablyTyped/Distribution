package typings.styledSystemShouldForwardProp

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@styled-system/should-forward-prop", JSImport.Default)
  @js.native
  val default: genericShouldForwardProp = js.native
  
  @JSImport("@styled-system/should-forward-prop", "createShouldForwardProp")
  @js.native
  def createShouldForwardProp(props: js.Array[String]): genericShouldForwardProp = js.native
  
  @JSImport("@styled-system/should-forward-prop", "props")
  @js.native
  val props: js.Array[String] = js.native
  
  type _To = genericShouldForwardProp
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: genericShouldForwardProp = default
  
  type genericShouldForwardProp = js.Function1[/* prop */ String, Boolean]
}
