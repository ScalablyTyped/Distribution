package typings.xmlCore

import typings.xmlCore.typesMod._XmlBufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object xmlCoreStrings {
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

