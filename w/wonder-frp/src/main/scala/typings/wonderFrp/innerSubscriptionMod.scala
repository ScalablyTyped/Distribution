package typings.wonderFrp

import typings.wonderFrp.generatorSubjectMod.GeneratorSubject
import typings.wonderFrp.idisposableMod.IDisposable
import typings.wonderFrp.observerMod.Observer
import typings.wonderFrp.subjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object innerSubscriptionMod {
  
  @JSImport("wonder-frp/dist/commonjs/Disposable/InnerSubscription", "InnerSubscription")
  @js.native
  open class InnerSubscription protected ()
    extends StObject
       with IDisposable {
    def this(subject: GeneratorSubject, observer: Observer) = this()
    def this(subject: Subject, observer: Observer) = this()
    
    /* private */ var _observer: Any = js.native
    
    /* private */ var _subject: Any = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  /* static members */
  object InnerSubscription {
    
    @JSImport("wonder-frp/dist/commonjs/Disposable/InnerSubscription", "InnerSubscription")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(subject: GeneratorSubject, observer: Observer): InnerSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subject.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[InnerSubscription]
    inline def create(subject: Subject, observer: Observer): InnerSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subject.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[InnerSubscription]
  }
}
