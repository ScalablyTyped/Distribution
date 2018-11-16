package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Pair extends Node {
  @JSName("cstNode")
  var cstNode_Pair: js.UndefOr[scala.Nothing] = js.undefined
  /**
           * key is always Node or null when parsed, but can be set to anything.
           */
  var key: AstNode | scala.Null
  var `type`: yamlLib.yamlLibStrings.PAIR
  /**
           * value is always Node or null when parsed, but can be set to anything.
           */
  var value: AstNode | scala.Null
}

