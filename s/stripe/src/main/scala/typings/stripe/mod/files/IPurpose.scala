package typings.stripe.mod.files

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.business_logo
  - typings.stripe.stripeStrings.dispute_evidence
  - typings.stripe.stripeStrings.identity_document
  - typings.stripe.stripeStrings.incorporation_article
  - typings.stripe.stripeStrings.incorporation_document
*/
trait IPurpose extends js.Object

object IPurpose {
  @scala.inline
  def business_logo: typings.stripe.stripeStrings.business_logo = this.cast("business_logo")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dispute_evidence: typings.stripe.stripeStrings.dispute_evidence = this.cast("dispute_evidence")
  @scala.inline
  def identity_document: typings.stripe.stripeStrings.identity_document = this.cast("identity_document")
  @scala.inline
  def incorporation_article: typings.stripe.stripeStrings.incorporation_article = this.cast("incorporation_article")
  @scala.inline
  def incorporation_document: typings.stripe.stripeStrings.incorporation_document = this.cast("incorporation_document")
}

