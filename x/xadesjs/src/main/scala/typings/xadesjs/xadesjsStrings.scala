package typings.xadesjs

import typings.xadesjs.buildTypesXmlEncapsulatedUnderscorePkiUnderscoreDataMod._EncodingType
import typings.xadesjs.buildTypesXmlObjectUnderscoreIdentifierMod.IdentifierQualifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object xadesjsStrings {
  @js.native
  sealed trait OIDAsURI extends IdentifierQualifier
  
  @js.native
  sealed trait OIDAsURN extends IdentifierQualifier
  
  @js.native
  sealed trait ber extends _EncodingType
  
  @js.native
  sealed trait cer extends _EncodingType
  
  @js.native
  sealed trait der extends _EncodingType
  
  @js.native
  sealed trait per extends _EncodingType
  
  @js.native
  sealed trait xer extends _EncodingType
  
  @scala.inline
  def OIDAsURI: OIDAsURI = "OIDAsURI".asInstanceOf[OIDAsURI]
  @scala.inline
  def OIDAsURN: OIDAsURN = "OIDAsURN".asInstanceOf[OIDAsURN]
  @scala.inline
  def ber: ber = "ber".asInstanceOf[ber]
  @scala.inline
  def cer: cer = "cer".asInstanceOf[cer]
  @scala.inline
  def der: der = "der".asInstanceOf[der]
  @scala.inline
  def per: per = "per".asInstanceOf[per]
  @scala.inline
  def xer: xer = "xer".asInstanceOf[xer]
}

