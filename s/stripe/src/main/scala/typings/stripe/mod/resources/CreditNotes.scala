package typings.stripe.mod.resources

import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IList
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.StripeResource
import typings.stripe.mod.creditNotes.ICreditNote
import typings.stripe.mod.creditNotes.ICreditNoteCreationOptions
import typings.stripe.mod.creditNotes.ICreditNoteListOptions
import typings.stripe.mod.creditNotes.ICreditNoteUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.CreditNotes")
@js.native
class CreditNotes () extends StripeResource {
  
  def create(data: ICreditNoteCreationOptions): js.Promise[ICreditNote] = js.native
  /**
    * A credit note can be issued for open and paid invoices.
    * When issued for an open invoice, a credit note decreases the invoice’s amount due.
    * When issued for a paid invoice, it is commonly used to refund or credit a specified amount to the customer.
    */
  def create(data: ICreditNoteCreationOptions, options: HeaderOptions): js.Promise[ICreditNote] = js.native
  def create(data: ICreditNoteCreationOptions, options: HeaderOptions, response: IResponseFn[ICreditNote]): js.Promise[ICreditNote] = js.native
  def create(data: ICreditNoteCreationOptions, response: IResponseFn[ICreditNote]): js.Promise[ICreditNote] = js.native
  
  def list(): js.Promise[IList[ICreditNote]] = js.native
  def list(data: ICreditNoteListOptions): js.Promise[IList[ICreditNote]] = js.native
  /**
    * Returns a list of your credit notes. Credit notes are returned sorted by creation date, with the most recently created credit note
    * items appearing first.
    */
  def list(data: ICreditNoteListOptions, options: HeaderOptions): js.Promise[IList[ICreditNote]] = js.native
  def list(data: ICreditNoteListOptions, options: HeaderOptions, response: IResponseFn[IList[ICreditNote]]): js.Promise[IList[ICreditNote]] = js.native
  def list(data: ICreditNoteListOptions, response: IResponseFn[IList[ICreditNote]]): js.Promise[IList[ICreditNote]] = js.native
  def list(options: HeaderOptions): js.Promise[IList[ICreditNote]] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[ICreditNote]]): js.Promise[IList[ICreditNote]] = js.native
  def list(response: IResponseFn[IList[ICreditNote]]): js.Promise[IList[ICreditNote]] = js.native
  
  def retrieve(creditNoteId: String): js.Promise[ICreditNote] = js.native
  /**
    * Retrieves the credit note with the given ID.
    */
  def retrieve(creditNoteId: String, options: HeaderOptions): js.Promise[ICreditNote] = js.native
  def retrieve(creditNoteId: String, options: HeaderOptions, response: IResponseFn[ICreditNote]): js.Promise[ICreditNote] = js.native
  def retrieve(creditNoteId: String, response: IResponseFn[ICreditNote]): js.Promise[ICreditNote] = js.native
  
  def update(creditNoteId: String, data: ICreditNoteUpdateOptions): js.Promise[ICreditNote] = js.native
  /**
    * Updates the memo or metadata on the credit note.
    */
  def update(creditNoteId: String, data: ICreditNoteUpdateOptions, options: HeaderOptions): js.Promise[ICreditNote] = js.native
  def update(
    creditNoteId: String,
    data: ICreditNoteUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[ICreditNote]
  ): js.Promise[ICreditNote] = js.native
  def update(creditNoteId: String, data: ICreditNoteUpdateOptions, response: IResponseFn[ICreditNote]): js.Promise[ICreditNote] = js.native
  
  def voidCreditNote(creditNoteId: String): js.Promise[ICreditNote] = js.native
  /**
    * Marks a credit note as void. Voiding a credit note reverses its adjustment. Voiding is only possible on open invoices.
    */
  def voidCreditNote(creditNoteId: String, options: HeaderOptions): js.Promise[ICreditNote] = js.native
  def voidCreditNote(creditNoteId: String, options: HeaderOptions, response: IResponseFn[ICreditNote]): js.Promise[ICreditNote] = js.native
  def voidCreditNote(creditNoteId: String, response: IResponseFn[ICreditNote]): js.Promise[ICreditNote] = js.native
}
