package typings.tinyTypedEmitter

import org.scalablytyped.runtime.StringDictionary
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("tiny-typed-emitter/lib", "TypedEmitter")
  @js.native
  open class TypedEmitter[L /* <: ListenerSignature[L] */] () extends StObject {
    
    def addListener[U /* <: /* keyof L */ String */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: L[U] */ js.Any
    ): this.type = js.native
    
    def emit[U /* <: /* keyof L */ String */](
      event: U,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<L[U]> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: L[U] */ js.Any
        ]
    ): Boolean = js.native
    
    def eventNames[U /* <: /* keyof L */ String */](): js.Array[U] = js.native
    
    def getMaxListeners(): Double = js.native
    
    def listenerCount(`type`: /* keyof L */ String): Double = js.native
    
    def listeners[U /* <: /* keyof L */ String */](`type`: U): js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: L[U] */ js.Any
      ] = js.native
    
    def off[U /* <: /* keyof L */ String */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: L[U] */ js.Any
    ): this.type = js.native
    
    def on[U /* <: /* keyof L */ String */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: L[U] */ js.Any
    ): this.type = js.native
    
    def once[U /* <: /* keyof L */ String */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: L[U] */ js.Any
    ): this.type = js.native
    
    def prependListener[U /* <: /* keyof L */ String */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: L[U] */ js.Any
    ): this.type = js.native
    
    def prependOnceListener[U /* <: /* keyof L */ String */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: L[U] */ js.Any
    ): this.type = js.native
    
    def rawListeners[U /* <: /* keyof L */ String */](`type`: U): js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: L[U] */ js.Any
      ] = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: /* keyof L */ String): this.type = js.native
    
    def removeListener[U /* <: /* keyof L */ String */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: L[U] */ js.Any
    ): this.type = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
  }
  /* static members */
  object TypedEmitter {
    
    @JSImport("tiny-typed-emitter/lib", "TypedEmitter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tiny-typed-emitter/lib", "TypedEmitter.defaultMaxListeners")
    @js.native
    def defaultMaxListeners: Double = js.native
    inline def defaultMaxListeners_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxListeners")(x.asInstanceOf[js.Any])
  }
  
  type DefaultListener = StringDictionary[js.Function1[/* repeated */ Any, Any]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ E in keyof L ]: (args : ...any): any}
    }}}
    */
  @js.native
  trait ListenerSignature[L] extends StObject
}
