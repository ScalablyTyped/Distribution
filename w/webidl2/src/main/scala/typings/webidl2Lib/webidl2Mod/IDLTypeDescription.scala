package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDLTypeDescription extends js.Object {
  /** String indicating the generic type (e.g. "Promise", "sequence"). null otherwise. */
  var generic: java.lang.String | scala.Null
  /**
       * In most cases, this will just be a string with the type name.
       * If the type is a union, then this contains an array of the types it unites.
       * If it is a generic type, it contains the IDL type description for the type in the sequence,
       * the eventual value of the promise, etc.
       */
  var idlType: java.lang.String | IDLTypeDescription | js.Array[IDLTypeDescription]
  /** Boolean indicating whether this is nullable or not. */
  var nullable: scala.Boolean
  /** Boolean indicating if it is a sequence. Same as generic === "sequence" */
  var sequence: scala.Boolean
  /** String indicating where this type is used. Can be null if not applicable. */
  var `type`: java.lang.String | scala.Null
  /** Boolean indicating whether this is a union type or not. */
  var union: scala.Boolean
}

