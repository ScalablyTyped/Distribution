package typings.vfile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encodings supported by the buffer class
  *
  * @remarks
  * This is a copy of the typing from Node, copied to prevent Node globals from being needed.
  * Copied from https://github.com/DefinitelyTyped/DefinitelyTyped/blob/a2bc1d868d81733a8969236655fa600bd3651a7b/types/node/globals.d.ts#L174
  */
/* Rewritten from type alias, can be one of: 
  - typings.vfile.vfileStrings.ascii
  - typings.vfile.vfileStrings.utf8
  - typings.vfile.vfileStrings.`utf-8`
  - typings.vfile.vfileStrings.utf16le
  - typings.vfile.vfileStrings.ucs2
  - typings.vfile.vfileStrings.`ucs-2`
  - typings.vfile.vfileStrings.base64
  - typings.vfile.vfileStrings.latin1
  - typings.vfile.vfileStrings.binary
  - typings.vfile.vfileStrings.hex
*/
trait BufferEncoding extends js.Object

object BufferEncoding {
  @scala.inline
  def ascii: typings.vfile.vfileStrings.ascii = "ascii".asInstanceOf[typings.vfile.vfileStrings.ascii]
  @scala.inline
  def base64: typings.vfile.vfileStrings.base64 = "base64".asInstanceOf[typings.vfile.vfileStrings.base64]
  @scala.inline
  def binary: typings.vfile.vfileStrings.binary = "binary".asInstanceOf[typings.vfile.vfileStrings.binary]
  @scala.inline
  def hex: typings.vfile.vfileStrings.hex = "hex".asInstanceOf[typings.vfile.vfileStrings.hex]
  @scala.inline
  def latin1: typings.vfile.vfileStrings.latin1 = "latin1".asInstanceOf[typings.vfile.vfileStrings.latin1]
  @scala.inline
  def `ucs-2`: typings.vfile.vfileStrings.`ucs-2` = "ucs-2".asInstanceOf[typings.vfile.vfileStrings.`ucs-2`]
  @scala.inline
  def ucs2: typings.vfile.vfileStrings.ucs2 = "ucs2".asInstanceOf[typings.vfile.vfileStrings.ucs2]
  @scala.inline
  def `utf-8`: typings.vfile.vfileStrings.`utf-8` = "utf-8".asInstanceOf[typings.vfile.vfileStrings.`utf-8`]
  @scala.inline
  def utf16le: typings.vfile.vfileStrings.utf16le = "utf16le".asInstanceOf[typings.vfile.vfileStrings.utf16le]
  @scala.inline
  def utf8: typings.vfile.vfileStrings.utf8 = "utf8".asInstanceOf[typings.vfile.vfileStrings.utf8]
}

