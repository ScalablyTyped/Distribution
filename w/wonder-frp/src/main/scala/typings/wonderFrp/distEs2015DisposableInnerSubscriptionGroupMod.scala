package typings.wonderFrp

import typings.wonderFrp.distEs2015DisposableIdisposableMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015DisposableInnerSubscriptionGroupMod {
  
  @JSImport("wonder-frp/dist/es2015/Disposable/InnerSubscriptionGroup", "InnerSubscriptionGroup")
  @js.native
  open class InnerSubscriptionGroup ()
    extends StObject
       with IDisposable {
    
    /* private */ var _container: Any = js.native
    
    def addChild(child: IDisposable): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  /* static members */
  object InnerSubscriptionGroup {
    
    @JSImport("wonder-frp/dist/es2015/Disposable/InnerSubscriptionGroup", "InnerSubscriptionGroup")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): InnerSubscriptionGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[InnerSubscriptionGroup]
  }
}
