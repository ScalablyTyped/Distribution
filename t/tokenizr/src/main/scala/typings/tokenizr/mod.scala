package typings.tokenizr

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.Instantiable6
import typings.std.Error
import typings.std.RegExpExecArray
import typings.tokenizr.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tokenizr", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Tokenizr
  /* static members */
  object default {
    
    @JSImport("tokenizr", "default.ActionContext")
    @js.native
    val ActionContext: Instantiable1[/* tokenizr */ Tokenizr, typings.tokenizr.mod.ActionContext] = js.native
    
    @JSImport("tokenizr", "default.ParsingError")
    @js.native
    val ParsingError: Instantiable5[
        /* message */ String, 
        /* pos */ Double, 
        /* line */ Double, 
        /* column */ Double, 
        /* input */ String, 
        typings.tokenizr.mod.ParsingError
      ] = js.native
    
    @JSImport("tokenizr", "default.Token")
    @js.native
    val Token: Instantiable6[
        /* type */ String, 
        /* value */ Any, 
        /* text */ String, 
        /* pos */ js.UndefOr[Double], 
        /* line */ js.UndefOr[Double], 
        /* column */ js.UndefOr[Double], 
        typings.tokenizr.mod.Token
      ] = js.native
  }
  
  @JSImport("tokenizr", "ActionContext")
  @js.native
  open class ActionContext protected () extends StObject {
    def this(tokenizr: Tokenizr) = this()
    
    def accept(`type`: String): this.type = js.native
    def accept(`type`: String, value: Any): this.type = js.native
    
    def data(key: String): Any = js.native
    def data(key: String, value: Any): Any = js.native
    
    def ignore(): this.type = js.native
    
    def info(): Column = js.native
    
    def pop(): String = js.native
    
    def push(state: String): this.type = js.native
    
    def reject(): this.type = js.native
    
    def repeat(): this.type = js.native
    
    def state(): String = js.native
    def state(state: String): this.type = js.native
    
    def stop(): this.type = js.native
    
    def tag(tag: String): this.type = js.native
    
    def tagged(tag: String): Boolean = js.native
    
    def untag(tag: String): this.type = js.native
  }
  
  @JSImport("tokenizr", "ParsingError")
  @js.native
  open class ParsingError protected ()
    extends StObject
       with Error {
    def this(message: String, pos: Double, line: Double, column: Double, input: String) = this()
    
    var column: Double = js.native
    
    var input: String = js.native
    
    var line: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var pos: Double = js.native
  }
  
  @JSImport("tokenizr", "Token")
  @js.native
  open class Token protected () extends StObject {
    def this(`type`: String, value: Any, text: String) = this()
    def this(`type`: String, value: Any, text: String, pos: Double) = this()
    def this(`type`: String, value: Any, text: String, pos: Double, line: Double) = this()
    def this(`type`: String, value: Any, text: String, pos: Unit, line: Double) = this()
    def this(`type`: String, value: Any, text: String, pos: Double, line: Double, column: Double) = this()
    def this(`type`: String, value: Any, text: String, pos: Double, line: Unit, column: Double) = this()
    def this(`type`: String, value: Any, text: String, pos: Unit, line: Double, column: Double) = this()
    def this(`type`: String, value: Any, text: String, pos: Unit, line: Unit, column: Double) = this()
    
    var column: Double = js.native
    
    def isA(`type`: String): Boolean = js.native
    def isA(`type`: String, value: Any): Boolean = js.native
    
    var line: Double = js.native
    
    var pos: Double = js.native
    
    var text: String = js.native
    
    def toString(colorize: js.Function2[/* type */ String, /* value */ String, String]): String = js.native
    
    var `type`: String = js.native
    
    var value: Any = js.native
  }
  
  type Action = js.ThisFunction3[
    /* this */ ActionContext, 
    /* ctx */ ActionContext, 
    /* match */ RegExpExecArray, 
    /* rule */ typings.tokenizr.anon.Action, 
    Unit
  ]
  
  type RuleAction = js.ThisFunction2[/* this */ ActionContext, /* ctx */ ActionContext, /* found */ RegExpExecArray, Unit]
  
  @js.native
  trait Tokenizr extends StObject {
    
    def after(action: Action): this.type = js.native
    
    def alternatives(alternatives: (js.ThisFunction0[/* this */ this.type, Any])*): Any = js.native
    
    def before(action: Action): this.type = js.native
    
    def begin(): this.type = js.native
    
    def commit(): this.type = js.native
    
    def consume(`type`: String): Token = js.native
    def consume(`type`: String, value: String): Token = js.native
    
    def debug(debug: Boolean): this.type = js.native
    
    def depth(): Double = js.native
    
    def error(message: String): ParsingError = js.native
    
    def finish(action: js.ThisFunction1[/* this */ ActionContext, /* ctx */ ActionContext, Unit]): this.type = js.native
    
    def input(input: String): this.type = js.native
    
    def peek(): Token = js.native
    def peek(offset: Double): Token = js.native
    
    def pop(): String = js.native
    
    def push(state: String): this.type = js.native
    
    def reset(): this.type = js.native
    
    def rollback(): this.type = js.native
    
    def rule(pattern: js.RegExp, action: RuleAction): this.type = js.native
    def rule(pattern: js.RegExp, action: RuleAction, name: String): this.type = js.native
    def rule(state: String, pattern: js.RegExp, action: RuleAction): this.type = js.native
    def rule(state: String, pattern: js.RegExp, action: RuleAction, name: String): this.type = js.native
    
    def skip(): this.type = js.native
    def skip(next: Double): this.type = js.native
    
    def state(): String = js.native
    def state(state: String): this.type = js.native
    
    def tag(tag: String): this.type = js.native
    
    def tagged(tag: String): Boolean = js.native
    
    def token(): Token = js.native
    
    def tokens(): js.Array[Token] = js.native
    
    def untag(tag: String): this.type = js.native
  }
}
