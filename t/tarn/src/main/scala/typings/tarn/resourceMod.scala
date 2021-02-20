package typings.tarn

import typings.tarn.utilsMod.Deferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceMod {
  
  @JSImport("tarn/dist/Resource", "Resource")
  @js.native
  class Resource[T] protected () extends StObject {
    def this(resource: T) = this()
    
    var deferred: Deferred[Unit] = js.native
    
    def promise: js.Promise[Unit] = js.native
    
    def resolve(): Resource[T] = js.native
    
    var resource: T = js.native
    
    val timestamp: Double = js.native
  }
}
