package typings.tstl

import typings.tstl.hasherMod.Hasher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/hash/HashBuckets", JSImport.Namespace)
@js.native
object hashBucketsMod extends js.Object {
  
  @js.native
  class HashBuckets[Key, Elem] protected () extends js.Object {
    def this(fetcher: Fetcher[Key, Elem], hasher: Hasher[Key]) = this()
    
    def at(index: Double): js.Array[Elem] = js.native
    
    def capacity(): Double = js.native
    
    def clear(): Unit = js.native
    
    var data_ : js.Any = js.native
    
    def erase(`val`: Elem): Unit = js.native
    
    val fetcher_ : js.Any = js.native
    
    def hash_function(): Hasher[Key] = js.native
    
    val hasher_ : js.Any = js.native
    
    var index: js.Any = js.native
    
    var initialize: js.Any = js.native
    
    def insert(`val`: Elem): Unit = js.native
    
    def length(): Double = js.native
    
    def load_factor(): Double = js.native
    
    def max_load_factor(): Double = js.native
    def max_load_factor(z: Double): Unit = js.native
    
    var max_load_factor_ : js.Any = js.native
    
    def rehash(length: Double): Unit = js.native
    
    def reserve(length: Double): Unit = js.native
    
    var size_ : js.Any = js.native
  }
  
  type Fetcher[Key, Elem] = js.Function1[/* elem */ Elem, Key]
}
