package typings.vfile

import typings.vfile.mod.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object vfileStrings {
  @js.native
  sealed trait ascii extends BufferEncoding
  
  @js.native
  sealed trait base64 extends BufferEncoding
  
  @js.native
  sealed trait binary extends BufferEncoding
  
  @js.native
  sealed trait hex extends BufferEncoding
  
  @js.native
  sealed trait latin1 extends BufferEncoding
  
  @js.native
  sealed trait `ucs-2` extends BufferEncoding
  
  @js.native
  sealed trait ucs2 extends BufferEncoding
  
  @js.native
  sealed trait `utf-8` extends BufferEncoding
  
  @js.native
  sealed trait utf16le extends BufferEncoding
  
  @js.native
  sealed trait utf8 extends BufferEncoding
  
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  @scala.inline
  def latin1: latin1 = "latin1".asInstanceOf[latin1]
  @scala.inline
  def `ucs-2`: `ucs-2` = "ucs-2".asInstanceOf[`ucs-2`]
  @scala.inline
  def ucs2: ucs2 = "ucs2".asInstanceOf[ucs2]
  @scala.inline
  def `utf-8`: `utf-8` = "utf-8".asInstanceOf[`utf-8`]
  @scala.inline
  def utf16le: utf16le = "utf16le".asInstanceOf[utf16le]
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}

