package typings.xmlDashCore

import typings.xmlDashCore.xmlDashCoreMod._XmlBufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object xmlDashCoreStrings {
  @js.native
  sealed trait Empty extends js.Object
  
  @js.native
  sealed trait `application/xml` extends js.Object
  
  @js.native
  sealed trait base64 extends _XmlBufferEncoding
  
  @js.native
  sealed trait base64url extends _XmlBufferEncoding
  
  @js.native
  sealed trait binary extends _XmlBufferEncoding
  
  @js.native
  sealed trait hex extends _XmlBufferEncoding
  
  @js.native
  sealed trait utf8 extends _XmlBufferEncoding
  
  @scala.inline
  def Empty: Empty = "".asInstanceOf[Empty]
  @scala.inline
  def `application/xml`: `application/xml` = "application/xml".asInstanceOf[`application/xml`]
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def base64url: base64url = "base64url".asInstanceOf[base64url]
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}

