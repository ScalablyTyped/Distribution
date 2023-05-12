package typings.yjs

import typings.std.Map
import typings.yjs.anon.Action
import typings.yjs.anon.Added
import typings.yjs.anon.Delete
import typings.yjs.distSrcStructsAbstractStructMod.AbstractStruct
import typings.yjs.distSrcTypesAbstractTypeMod.AbstractType
import typings.yjs.distSrcUtilsTransactionMod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsYeventMod {
  
  @JSImport("yjs/dist/src/utils/YEvent", "YEvent")
  @js.native
  open class YEvent[T /* <: AbstractType[Any] */] protected () extends StObject {
    /**
      * @param {T} target The changed type.
      * @param {Transaction} transaction
      */
    def this(target: T, transaction: Transaction) = this()
    
    /**
      * @type {Object|null}
      */
    var _changes: js.Object | Null = js.native
    
    /**
      * @type {null | Array<{ insert?: string | Array<any> | object | AbstractType<any>, retain?: number, delete?: number, attributes?: Object<string, any> }>}
      */
    var _delta: js.Array[Delete] | Null = js.native
    
    /**
      * @type {null | Map<string, { action: 'add' | 'update' | 'delete', oldValue: any, newValue: any }>}
      */
    var _keys: (Map[String, Action]) | Null = js.native
    
    /**
      * Check if a struct is added by this event.
      *
      * In contrast to change.deleted, this method also returns true if the struct was added and then deleted.
      *
      * @param {AbstractStruct} struct
      * @return {boolean}
      */
    def adds(struct: AbstractStruct): Boolean = js.native
    
    /**
      * This is a computed property. Note that this can only be safely computed during the
      * event call. Computing this property after other changes happened might result in
      * unexpected behavior (incorrect computation of deltas). A safe way to collect changes
      * is to store the `changes` or the `delta` object. Avoid storing the `transaction` object.
      *
      * @type {{added:Set<Item>,deleted:Set<Item>,keys:Map<string,{action:'add'|'update'|'delete',oldValue:any}>,delta:Array<{insert?:Array<any>|string, delete?:number, retain?:number}>}}
      */
    def changes: Added = js.native
    
    /**
      * The current target on which the observe callback is called.
      * @type {AbstractType<any>}
      */
    var currentTarget: AbstractType[Any] = js.native
    
    /**
      * Check if a struct is deleted by this event.
      *
      * In contrast to change.deleted, this method also returns true if the struct was added and then deleted.
      *
      * @param {AbstractStruct} struct
      * @return {boolean}
      */
    def deletes(struct: AbstractStruct): Boolean = js.native
    
    /**
      * This is a computed property. Note that this can only be safely computed during the
      * event call. Computing this property after other changes happened might result in
      * unexpected behavior (incorrect computation of deltas). A safe way to collect changes
      * is to store the `changes` or the `delta` object. Avoid storing the `transaction` object.
      *
      * @type {Array<{insert?: string | Array<any> | object | AbstractType<any>, retain?: number, delete?: number, attributes?: Object<string, any>}>}
      */
    def delta: js.Array[Delete] = js.native
    
    /**
      * @type {Map<string, { action: 'add' | 'update' | 'delete', oldValue: any, newValue: any }>}
      */
    def keys: Map[String, Action] = js.native
    
    /**
      * Computes the path from `y` to the changed type.
      *
      * @todo v14 should standardize on path: Array<{parent, index}> because that is easier to work with.
      *
      * The following property holds:
      * @example
      *   let type = y
      *   event.path.forEach(dir => {
      *     type = type.get(dir)
      *   })
      *   type === event.target // => true
      */
    def path: js.Array[String | Double] = js.native
    
    /**
      * The type on which this event was created on.
      * @type {T}
      */
    var target: T = js.native
    
    /**
      * The transaction that triggered this event.
      * @type {Transaction}
      */
    var transaction: Transaction = js.native
  }
}
