package typings.tmiJs

import typings.std.Exclude
import typings.std.Pick
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strictEventEmitterTypesMod {
  
  type EEMethodReturnType[T, S /* <: String */, TValue, FValue] = FValue | (InnerEEMethodReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T[S] */ js.Any, 
    TValue, 
    FValue
  ])
  
  type EmitEventNames[TEmitter /* <: TypeRecord[js.Any, js.Any, js.Any] */, TEventRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _eventsType'] */ js.Any
  ] */, TEmitRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _emitType'] */ js.Any
  ] */] = /* keyof TEmitRecord */ String
  
  type EventNames[TEmitter /* <: TypeRecord[js.Any, js.Any, js.Any] */, TEventRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _eventsType'] */ js.Any
  ] */, TEmitRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _emitType'] */ js.Any
  ] */] = /* keyof TEmitRecord */ String
  
  type InnerEEMethodReturnType[T, TValue, FValue] = FValue | TValue
  
  type ListenerType[T] = js.Array[js.Any | T]
  
  type MatchingKeys[TRecord, TMatch, K /* <: /* keyof TRecord */ String */] = K
  
  type NoUndefined[T] = T
  
  type OnEventNames[TEmitter /* <: TypeRecord[js.Any, js.Any, js.Any] */, TEventRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _eventsType'] */ js.Any
  ] */, TEmitRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _emitType'] */ js.Any
  ] */] = /* keyof TEventRecord */ String
  
  /* keyof tmi.js.tmi.js/strict-event-emitter-types.OverriddenMethods<any, any, any> */ /* Rewritten from type alias, can be one of: 
    - typings.tmiJs.tmiJsStrings.on
    - typings.tmiJs.tmiJsStrings.addListener
    - typings.tmiJs.tmiJsStrings.addEventListener
    - typings.tmiJs.tmiJsStrings.removeListener
    - typings.tmiJs.tmiJsStrings.removeEventListener
    - typings.tmiJs.tmiJsStrings.once
    - typings.tmiJs.tmiJsStrings.emit
  */
  trait OverriddenKeys extends StObject
  
  @js.native
  trait OverriddenMethods[TEmitter, TEventRecord, TEmitRecord] extends StObject {
    
    def addEventListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, js.Any]): Unit = js.native
    def addEventListener[P /* <: /* keyof TEventRecord */ String */, T](
      event: P,
      listener: js.Function1[
          /* args */ ListenerType[
            /* import warning: importer.ImportType#apply Failed type conversion: TEventRecord[P] */ js.Any
          ], 
          Unit
        ]
    ): EEMethodReturnType[TEmitter, typings.tmiJs.tmiJsStrings.addEventListener, T, Unit] = js.native
    
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, js.Any]): Unit = js.native
    def addListener[P /* <: /* keyof TEventRecord */ String */, T](
      event: P,
      listener: js.Function1[
          /* args */ ListenerType[
            /* import warning: importer.ImportType#apply Failed type conversion: TEventRecord[P] */ js.Any
          ], 
          Unit
        ]
    ): EEMethodReturnType[TEmitter, typings.tmiJs.tmiJsStrings.addListener, T, Unit] = js.native
    
    def emit(event: js.Symbol, args: js.Any*): Unit = js.native
    def emit[P /* <: /* keyof TEmitRecord */ String */, T](
      event: P,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ListenerType<TEmitRecord[P]> is not an array type */ args: ListenerType[
          /* import warning: importer.ImportType#apply Failed type conversion: TEmitRecord[P] */ js.Any
        ]
    ): EEMethodReturnType[TEmitter, typings.tmiJs.tmiJsStrings.emit, T, Unit] = js.native
    
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, js.Any]): Unit = js.native
    def on[P /* <: /* keyof TEventRecord */ String */, T](
      event: P,
      listener: js.Function1[
          /* args */ ListenerType[
            /* import warning: importer.ImportType#apply Failed type conversion: TEventRecord[P] */ js.Any
          ], 
          Unit
        ]
    ): EEMethodReturnType[TEmitter, typings.tmiJs.tmiJsStrings.on, T, Unit] = js.native
    
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, js.Any]): Unit = js.native
    def once[P /* <: /* keyof TEventRecord */ String */, T](
      event: P,
      listener: js.Function1[
          /* args */ ListenerType[
            /* import warning: importer.ImportType#apply Failed type conversion: TEventRecord[P] */ js.Any
          ], 
          Unit
        ]
    ): EEMethodReturnType[TEmitter, typings.tmiJs.tmiJsStrings.once, T, Unit] = js.native
    
    def removeEventListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, js.Any]): Unit = js.native
    def removeEventListener[T](event: /* keyof TEventRecord */ String, listener: js.Function1[/* repeated */ js.Any, js.Any]): EEMethodReturnType[TEmitter, typings.tmiJs.tmiJsStrings.removeEventListener, T, Unit] = js.native
    
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, js.Any]): Unit = js.native
    def removeListener[T](event: /* keyof TEventRecord */ String, listener: js.Function1[/* repeated */ js.Any, js.Any]): EEMethodReturnType[TEmitter, typings.tmiJs.tmiJsStrings.removeListener, T, Unit] = js.native
  }
  
  type ReturnTypeOfMethod[T] = ReturnType[T]
  
  type ReturnTypeOfMethodIfExists[T, S /* <: String */] = ReturnTypeOfMethod[
    /* import warning: importer.ImportType#apply Failed type conversion: T[S] */ js.Any
  ]
  
  @js.native
  trait StrictBroadcast[TEmitter /* <: TypeRecord[js.Any, js.Any, js.Any] */, TEmitRecord /* <: NoUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _emitType'] */ js.Any
  ] */, VK /* <: VoidKeys[TEmitRecord] */, NVK /* <: Exclude[/* keyof TEmitRecord */ String, VK] */] extends StObject {
    
    def apply(event: VK): js.Any = js.native
    def apply[E /* <: NVK */](
      event: E,
      request: /* import warning: importer.ImportType#apply Failed type conversion: TEmitRecord[E] */ js.Any
    ): js.Any = js.native
  }
  
  type StrictEventEmitter[TEmitterType, TEventRecord, TEmitRecord, UnneededMethods /* <: Exclude[OverriddenKeys, /* keyof TEmitterType */ String] */, NeededMethods /* <: Exclude[OverriddenKeys, UnneededMethods] */] = (TypeRecord[TEmitterType, TEventRecord, TEmitRecord]) & (Pick[TEmitterType, Exclude[/* keyof TEmitterType */ String, OverriddenKeys]]) & (Pick[OverriddenMethods[TEmitterType, TEventRecord, TEmitRecord], NeededMethods])
  
  trait TypeRecord[T, U, V] extends StObject {
    
    @JSName(" _emitType")
    var Space_emitType: js.UndefOr[V] = js.undefined
    
    @JSName(" _emitterType")
    var Space_emitterType: js.UndefOr[T] = js.undefined
    
    @JSName(" _eventsType")
    var Space_eventsType: js.UndefOr[U] = js.undefined
  }
  object TypeRecord {
    
    inline def apply[T, U, V](): TypeRecord[T, U, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeRecord[T, U, V]]
    }
    
    extension [Self <: TypeRecord[?, ?, ?], T, U, V](x: Self & (TypeRecord[T, U, V])) {
      
      inline def setSpace_emitType(value: V): Self = StObject.set(x, " _emitType", value.asInstanceOf[js.Any])
      
      inline def setSpace_emitTypeUndefined: Self = StObject.set(x, " _emitType", js.undefined)
      
      inline def setSpace_emitterType(value: T): Self = StObject.set(x, " _emitterType", value.asInstanceOf[js.Any])
      
      inline def setSpace_emitterTypeUndefined: Self = StObject.set(x, " _emitterType", js.undefined)
      
      inline def setSpace_eventsType(value: U): Self = StObject.set(x, " _eventsType", value.asInstanceOf[js.Any])
      
      inline def setSpace_eventsTypeUndefined: Self = StObject.set(x, " _eventsType", js.undefined)
    }
  }
  
  type VoidKeys[Record] = MatchingKeys[Record, Unit, /* keyof Record */ String]
}
