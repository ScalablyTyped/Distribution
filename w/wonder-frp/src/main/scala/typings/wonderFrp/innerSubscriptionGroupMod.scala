package typings.wonderFrp

import typings.wonderFrp.idisposableMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object innerSubscriptionGroupMod {
  
  @JSImport("wonder-frp/dist/commonjs/Disposable/InnerSubscriptionGroup", "InnerSubscriptionGroup")
  @js.native
  class InnerSubscriptionGroup ()
    extends StObject
       with IDisposable {
    
    var _container: js.Any = js.native
    
    def addChild(child: IDisposable): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  /* static members */
  object InnerSubscriptionGroup {
    
    @JSImport("wonder-frp/dist/commonjs/Disposable/InnerSubscriptionGroup", "InnerSubscriptionGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): InnerSubscriptionGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[InnerSubscriptionGroup]
  }
}
