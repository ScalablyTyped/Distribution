package typings.tokenizr

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.Instantiable6
import typings.std.Error
import typings.std.RegExp
import typings.std.RegExpExecArray
import typings.std.ReturnType
import typings.tokenizr.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tokenizr", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Tokenizr
  object default {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("tokenizr", "default.ActionContext")
    @js.native
    class ActionContext protected ()
      extends StObject
         with typings.tokenizr.mod.ActionContext {
      def this(e: js.Any) = this()
    }
    /* static member */
    /* was `typeof ActionContext` */
    @JSImport("tokenizr", "default.ActionContext")
    @js.native
    val ActionContext: Instantiable1[/* e */ js.Any, typings.tokenizr.mod.ActionContext] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("tokenizr", "default.ParsingError")
    @js.native
    class ParsingError protected ()
      extends StObject
         with typings.tokenizr.mod.ParsingError {
      def this(message: String, pos: Double, line: Double, column: Double, input: String) = this()
      
      /* CompleteClass */
      var message: String = js.native
      
      /* CompleteClass */
      var name: String = js.native
    }
    /* static member */
    /* was `typeof ParsingError` */
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
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("tokenizr", "default.Token")
    @js.native
    class Token[T] protected ()
      extends StObject
         with typings.tokenizr.mod.Token[T] {
      def this(
        `type`: String,
        value: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any,
        text: String
      ) = this()
      def this(
        `type`: String,
        value: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any,
        text: String,
        pos: Double
      ) = this()
      def this(
        `type`: String,
        value: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any,
        text: String,
        pos: Double,
        line: Double
      ) = this()
      def this(
        `type`: String,
        value: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any,
        text: String,
        pos: Unit,
        line: Double
      ) = this()
      def this(
        `type`: String,
        value: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any,
        text: String,
        pos: Double,
        line: Double,
        column: Double
      ) = this()
      def this(
        `type`: String,
        value: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any,
        text: String,
        pos: Double,
        line: Unit,
        column: Double
      ) = this()
      def this(
        `type`: String,
        value: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any,
        text: String,
        pos: Unit,
        line: Double,
        column: Double
      ) = this()
      def this(
        `type`: String,
        value: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any,
        text: String,
        pos: Unit,
        line: Unit,
        column: Double
      ) = this()
    }
    /* static member */
    /* was `typeof Token` */
    @JSImport("tokenizr", "default.Token")
    @js.native
    val Token: Instantiable6[
        /* type */ String, 
        /* import warning: RewrittenClass.unapply cls was tparam T */ /* value */ js.Any, 
        /* text */ String, 
        /* pos */ js.UndefOr[Double], 
        /* line */ js.UndefOr[Double], 
        /* column */ js.UndefOr[Double], 
        typings.tokenizr.mod.Token[js.Object]
      ] = js.native
  }
  
  type Action = js.ThisFunction3[
    /* this */ ActionContext, 
    /* ctx */ ActionContext, 
    /* found */ RegExpExecArray, 
    /* rule */ typings.tokenizr.anon.Action, 
    Unit
  ]
  
  @js.native
  trait ActionContext extends StObject {
    
    /**
      * Accept current matching as a new token
      */
    def accept(`type`: String): this.type = js.native
    def accept(`type`: String, value: js.Any): this.type = js.native
    
    /**
      * Store and retrieve user data attached to context
      */
    def data(key: String): js.Any = js.native
    def data(key: String, value: js.Any): js.Any = js.native
    
    /**
      * Mark current matching to be ignored
      */
    def ignore(): this.type = js.native
    
    /**
      * Retrieve information of current matching
      */
    def info(): Column = js.native
    
    /**
      * Pop state
      */
    def pop(): String = js.native
    
    /**
      * Push state
      */
    def push(state: String): this.type = js.native
    
    /**
      * Rark current matching to be rejected
      */
    def reject(): this.type = js.native
    
    /**
      * Mark current matching to be repeated from scratch
      */
    def repeat(): this.type = js.native
    
    /**
      * Get/set state
      */
    def state(): String = js.native
    /**
      * Replaces the current state
      */
    def state(state: String): this.type = js.native
    
    /**
      * Immediately stop tokenization
      */
    def stop(): this.type = js.native
    
    /**
      * Set a tag
      */
    def tag(tag: String): this.type = js.native
    
    /**
      * Check whether tag is set
      */
    def tagged(tag: String): Boolean = js.native
    
    /**
      * Unset a tag
      */
    def untag(tag: String): this.type = js.native
  }
  
  type IToken[T] = Token[T]
  
  trait ParsingError
    extends StObject
       with Error
  object ParsingError {
    
    inline def apply(message: String, name: String): ParsingError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsingError]
    }
  }
  
  type RuleAction = js.ThisFunction2[/* this */ ActionContext, /* ctx */ ActionContext, /* found */ RegExpExecArray, Unit]
  
  @js.native
  trait Token[T] extends StObject {
    
    var column: js.UndefOr[Double] = js.native
    
    def isA(`type`: String): Boolean = js.native
    def isA(`type`: String, value: js.Any): Boolean = js.native
    
    var line: js.UndefOr[Double] = js.native
    
    var pos: js.UndefOr[Double] = js.native
    
    var text: String = js.native
    
    var `type`: String = js.native
    
    var value: T = js.native
  }
  
  @js.native
  trait Tokenizr extends StObject {
    
    /**
      * Configure a tokenization after-rule callback
      */
    def after(action: Action): this.type = js.native
    
    /**
      * Execute multiple alternative callbacks
      */
    def alternatives[X /* <: js.Array[js.ThisFunction0[/* this */ this.type, js.Any]] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param alternatives because its type X is not an array type */ alternatives: X
    ): ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: X[number] */ js.Any
      ] = js.native
    
    /**
      * Configure a tokenization before-rule callback
      */
    def before(action: Action): this.type = js.native
    
    /**
      * Open tokenization transaction
      */
    def begin(): this.type = js.native
    
    /**
      * Close (successfully) tokenization transaction
      */
    def commit(): this.type = js.native
    
    /**
      * Consume the current token (by expecting it to be a particular symbol)
      */
    def consume(`type`: String): Token[js.Any] = js.native
    def consume(`type`: String, value: js.Any): Token[js.Any] = js.native
    
    /**
      * Configure debug operation
      */
    def debug(enableDebug: Boolean): this.type = js.native
    
    /**
      * Determine depth of still open tokenization transaction
      */
    def depth(): Double = js.native
    
    /**
      * Create an error message for the current position
      */
    def error(): ParsingError = js.native
    def error(message: String): ParsingError = js.native
    
    /**
      * Configure a tokenization finish callback
      */
    def finish(action: js.ThisFunction1[/* this */ ActionContext, /* ctx */ ActionContext, Unit]): this.type = js.native
    
    /**
      * Provide (new) input string to tokenize
      */
    def input(input: String): this.type = js.native
    
    /**
      * Peek at the next token or token at particular offset
      */
    def peek(): Token[js.Any] = js.native
    def peek(offset: Double): Token[js.Any] = js.native
    
    /**
      * Pop state
      */
    def pop(): String = js.native
    
    /**
      * Push state
      */
    def push(state: String): this.type = js.native
    
    /**
      * Reset the internal state
      */
    def reset(): this.type = js.native
    
    /**
      * Close (unsuccessfully) tokenization transaction
      */
    def rollback(): this.type = js.native
    
    /**
      * Configure a tokenization rule
      */
    def rule(pattern: RegExp, action: RuleAction): this.type = js.native
    def rule(pattern: RegExp, action: RuleAction, name: String): this.type = js.native
    def rule(state: String, pattern: RegExp, action: RuleAction, name: String): this.type = js.native
    
    /**
      * Skip one or more tokens
      */
    def skip(): this.type = js.native
    def skip(len: Double): this.type = js.native
    
    /**
      * Get/set state
      */
    def state(): String = js.native
    /**
      * Replaces the current state
      */
    def state(state: String): this.type = js.native
    
    /**
      * Set a tag
      */
    def tag(tag: String): this.type = js.native
    
    /**
      * Check whether tag is set
      */
    def tagged(tag: String): Boolean = js.native
    
    /**
      * Determine and return next token
      */
    def token(): Token[js.Any] | Null = js.native
    
    /**
      * Determine and return all tokens
      */
    def tokens(): js.Array[Token[js.Any]] = js.native
    
    /**
      * Unset a tag
      */
    def untag(tag: String): this.type = js.native
  }
}
