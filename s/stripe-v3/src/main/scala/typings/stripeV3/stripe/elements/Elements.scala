package typings.stripeV3.stripe.elements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Elements extends js.Object {
  
  def create(`type`: elementsType): Element = js.native
  def create(`type`: elementsType, options: ElementsOptions): Element = js.native
  
  def getElement(`type`: elementsType): Element | Null = js.native
}
