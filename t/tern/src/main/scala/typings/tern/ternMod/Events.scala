package typings.tern.ternMod

import typings.estree.mod.Node
import typings.estree.mod.Program
import typings.tern.inferMod.Scope
import typings.tern.inferMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Events extends StObject {
  
  /** After analyzing a file. */
  def afterLoad(file: File): Unit = js.native
  
  /** Before analyzing a file. file is an object holding {name, text, scope} properties. */
  def beforeLoad(file: File): Unit = js.native
  
  /** Run at the start of a completion query. May return a valid completion result to replace the default completion algorithm. */
  def completion(file: File, query: CompletionsQuery): CompletionsQueryResult | Unit = js.native
  
  /** Run after the type inference pass. */
  def postInfer(ast: Program, scope: Scope): Unit = js.native
  
  /** Run right after a file is parsed, and passed the parse tree and the parsed file as arguments. */
  def postParse(ast: Program, text: String): Unit = js.native
  
  /** Run right before the type inference pass, passing the syntax tree and a scope object. */
  def preInfer(ast: Program, scope: Scope): Unit = js.native
  
  /**
    * Will be run right before a file is parsed, and passed the given text and options. If a handler
    * returns a new text value, the origin text will be overriden. This is useful for
    * instance when a plugin is able to extract JavaScript content from an HTML file.
    */
  def preParse(text: String, options: js.Object): String | Unit = js.native
  
  /** When the server throws away its current analysis data and starts a fresh run. */
  def reset(): Unit = js.native
  
  /**
    * Run after Tern attempts to find the type at the position end in the given file.
    * A handler may return either the given type (already calculated by Tern and earlier "typeAt" passes)
    * or an alternate type to be used instead. This is useful when
    * a plugin can provide a more helpful type than Tern (e.g. within comments).
    */
  def typeAt(file: File, end: Position, expr: Node, `type`: Type): Type | Unit = js.native
}
object Events {
  
  @scala.inline
  def apply(
    afterLoad: File => Unit,
    beforeLoad: File => Unit,
    completion: (File, CompletionsQuery) => CompletionsQueryResult | Unit,
    postInfer: (Program, Scope) => Unit,
    postParse: (Program, String) => Unit,
    preInfer: (Program, Scope) => Unit,
    preParse: (String, js.Object) => String | Unit,
    reset: () => Unit,
    typeAt: (File, Position, Node, Type) => Type | Unit
  ): Events = {
    val __obj = js.Dynamic.literal(afterLoad = js.Any.fromFunction1(afterLoad), beforeLoad = js.Any.fromFunction1(beforeLoad), completion = js.Any.fromFunction2(completion), postInfer = js.Any.fromFunction2(postInfer), postParse = js.Any.fromFunction2(postParse), preInfer = js.Any.fromFunction2(preInfer), preParse = js.Any.fromFunction2(preParse), reset = js.Any.fromFunction0(reset), typeAt = js.Any.fromFunction4(typeAt))
    __obj.asInstanceOf[Events]
  }
  
  @scala.inline
  implicit class EventsMutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterLoad(value: File => Unit): Self = StObject.set(x, "afterLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeLoad(value: File => Unit): Self = StObject.set(x, "beforeLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompletion(value: (File, CompletionsQuery) => CompletionsQueryResult | Unit): Self = StObject.set(x, "completion", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPostInfer(value: (Program, Scope) => Unit): Self = StObject.set(x, "postInfer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPostParse(value: (Program, String) => Unit): Self = StObject.set(x, "postParse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPreInfer(value: (Program, Scope) => Unit): Self = StObject.set(x, "preInfer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPreParse(value: (String, js.Object) => String | Unit): Self = StObject.set(x, "preParse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTypeAt(value: (File, Position, Node, Type) => Type | Unit): Self = StObject.set(x, "typeAt", js.Any.fromFunction4(value))
  }
}
