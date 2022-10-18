package typings.undici

import typings.node.urlMod.URL_
import typings.undici.typesPoolMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBalancedPoolMod {
  
  @JSImport("undici/types/balanced-pool", JSImport.Namespace)
  @js.native
  open class ^ protected () extends BalancedPool {
    def this(url: String) = this()
    def this(url: js.Array[String]) = this()
    def this(url: URL_) = this()
    def this(url: String, options: Options) = this()
    def this(url: js.Array[String], options: Options) = this()
    def this(url: URL_, options: Options) = this()
  }
  
  @js.native
  trait BalancedPool
    extends typings.undici.typesDispatcherMod.^ {
    
    def addUpstream(upstream: String): BalancedPool = js.native
    
    /** `true` after `pool.close()` has been called. */
    var closed: Boolean = js.native
    
    /** `true` after `pool.destroyed()` has been called or `pool.close()` has been called and the pool shutdown has completed. */
    var destroyed: Boolean = js.native
    
    def removeUpstream(upstream: String): BalancedPool = js.native
    
    var upstreams: js.Array[String] = js.native
  }
}
