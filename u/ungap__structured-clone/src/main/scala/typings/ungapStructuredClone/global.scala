package typings.ungapStructuredClone

import typings.ungapStructuredClone.anon.Lossy
import typings.ungapStructuredClone.mod.SerializedRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object structuredClone {
    
    /**
      * Returns a clone of the input value.
      * @param any a serializable value.
      * @param options an object with a `lossy` property that,
      *  if `true`, will not throw errors on incompatible types, and behave more
      *  like JSON stringify would behave. Symbol and Function will be discarded.
      * @returns a clone of the input value
      */
    inline def apply[T](any: T): T = ^.asInstanceOf[js.Dynamic].apply(any.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def apply[T](any: T, options: Lossy): T = (^.asInstanceOf[js.Dynamic].apply(any.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
    
    @JSGlobal("structuredClone")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Deserialize the output.
      * @param serialized a previously serialized value.
      * @returns Deserialized output
      */
    inline def deserialize(serialized: SerializedRecord): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(serialized.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * Serialize the input.
      * @param serializable a serializable value.
      * @param options an object with a `lossy` property that,
      *  if `true`, will not throw errors on incompatible types, and behave more
      *  like JSON stringify would behave. Symbol and Function will be discarded.
      * @returns an array of SerializedRecord
      */
    inline def serialize(serializable: Any): SerializedRecord = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(serializable.asInstanceOf[js.Any]).asInstanceOf[SerializedRecord]
    inline def serialize(serializable: Any, options: Lossy): SerializedRecord = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(serializable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SerializedRecord]
  }
}
