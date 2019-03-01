package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  /** After analyzing a file. */
  def afterLoad(file: File): scala.Unit
  /** Before analyzing a file. file is an object holding {name, text, scope} properties. */
  def beforeLoad(file: File): scala.Unit
  /** Run at the start of a completion query. May return a valid completion result to replace the default completion algorithm. */
  def completion(file: File, query: Query): CompletionsQueryResult | scala.Unit
  /** Run after the type inference pass. */
  def postInfer(ast: estreeLib.estreeMod.Program, scope: ternLib.libInferMod.Scope): scala.Unit
  /** Run right after a file is parsed, and passed the parse tree and the parsed file as arguments. */
  def postParse(ast: estreeLib.estreeMod.Program, text: java.lang.String): scala.Unit
  /** Run right before the type inference pass, passing the syntax tree and a scope object. */
  def preInfer(ast: estreeLib.estreeMod.Program, scope: ternLib.libInferMod.Scope): scala.Unit
  /**
    * Will be run right before a file is parsed, and passed the given text and options. If a handler
    * returns a new text value, the origin text will be overriden. This is useful for
    * instance when a plugin is able to extract JavaScript content from an HTML file.
    */
  def preParse(text: java.lang.String, options: js.Object): java.lang.String | scala.Unit
  /** When the server throws away its current analysis data and starts a fresh run. */
  def reset(): scala.Unit
  /**
    * Run after Tern attempts to find the type at the position end in the given file.
    * A handler may return either the given type (already calculated by Tern and earlier "typeAt" passes)
    * or an alternate type to be used instead. This is useful when
    * a plugin can provide a more helpful type than Tern (e.g. within comments).
    */
  def typeAt(file: File, end: Position, expr: estreeLib.estreeMod.Node, `type`: ternLib.libInferMod.Type): ternLib.libInferMod.Type | scala.Unit
}

object Events {
  @scala.inline
  def apply(
    afterLoad: js.Function1[File, scala.Unit],
    beforeLoad: js.Function1[File, scala.Unit],
    completion: js.Function2[File, Query, CompletionsQueryResult | scala.Unit],
    postInfer: js.Function2[estreeLib.estreeMod.Program, ternLib.libInferMod.Scope, scala.Unit],
    postParse: js.Function2[estreeLib.estreeMod.Program, java.lang.String, scala.Unit],
    preInfer: js.Function2[estreeLib.estreeMod.Program, ternLib.libInferMod.Scope, scala.Unit],
    preParse: js.Function2[java.lang.String, js.Object, java.lang.String | scala.Unit],
    reset: js.Function0[scala.Unit],
    typeAt: js.Function4[
      File, 
      Position, 
      estreeLib.estreeMod.Node, 
      ternLib.libInferMod.Type, 
      ternLib.libInferMod.Type | scala.Unit
    ]
  ): Events = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterLoad")(afterLoad)
    __obj.updateDynamic("beforeLoad")(beforeLoad)
    __obj.updateDynamic("completion")(completion)
    __obj.updateDynamic("postInfer")(postInfer)
    __obj.updateDynamic("postParse")(postParse)
    __obj.updateDynamic("preInfer")(preInfer)
    __obj.updateDynamic("preParse")(preParse)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("typeAt")(typeAt)
    __obj.asInstanceOf[Events]
  }
}

