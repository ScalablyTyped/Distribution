package typings.wonderFrp

import typings.wonderFrp.coreObserverMod.Observer
import typings.wonderFrp.disposableIdisposableMod.IDisposable
import typings.wonderFrp.subjectGeneratorSubjectMod.GeneratorSubject
import typings.wonderFrp.subjectSubjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disposableInnerSubscriptionMod {
  
  @JSImport("wonder-frp/dist/es2015/Disposable/InnerSubscription", "InnerSubscription")
  @js.native
  class InnerSubscription protected ()
    extends StObject
       with IDisposable {
    def this(subject: GeneratorSubject, observer: Observer) = this()
    def this(subject: Subject, observer: Observer) = this()
    
    /* private */ var _observer: js.Any = js.native
    
    /* private */ var _subject: js.Any = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  /* static members */
  object InnerSubscription {
    
    @JSImport("wonder-frp/dist/es2015/Disposable/InnerSubscription", "InnerSubscription")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(subject: GeneratorSubject, observer: Observer): InnerSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subject.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[InnerSubscription]
    inline def create(subject: Subject, observer: Observer): InnerSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subject.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[InnerSubscription]
  }
}
