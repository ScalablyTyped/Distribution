package typings
package stripejsLib.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementFactory extends js.Object {
  /**
    * Creates a new StripeJS element
    * @see https://stripe.com/docs/stripe-js/reference#elements-create
    * @param type - The type of element that should be created
    * @param options - Any options that should be used to con
    *
    * @example ```
    * const style = {
    *    base: {
    *      color: '#303238',
    *      fontSize: '16px',
    *      color: "#32325d",
    *      fontSmoothing: 'antialiased',
    *      '::placeholder': {
    *        color: '#ccc',
    *      },
    *    },
    *    invalid: {
    *      color: '#e5424d',
    *      ':focus': {
    *        color: '#303238',
    *        },
    *    },
    * };
    * const cardElement = elementCreator.create('card', {style: style})
    * ```
    *
    * @return The created element
    */
  def create(`type`: ElementType, options: CardElementOptions): StripeElement = js.native
  def create(`type`: ElementType, options: IBANElementOptions): StripeElement = js.native
  def create(`type`: ElementType, options: IdealBankOptions): StripeElement = js.native
  def create(`type`: ElementType, options: PaymentButtonOptions): StripeElement = js.native
}

