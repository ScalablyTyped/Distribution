package typings.vscodeLanguageserver

import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserver.mod.Feature
import typings.vscodeLanguageserver.mod._RemoteWindow
import typings.vscodeLanguageserverProtocol.mod.ProgressType
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressMod {
  
  @JSImport("vscode-languageserver/lib/progress", "ProgressFeature")
  @js.native
  val ProgressFeature: Feature[_RemoteWindow, WindowProgress] = js.native
  
  @JSImport("vscode-languageserver/lib/progress", "attachPartialResult")
  @js.native
  def attachPartialResult[R](connection: ProgressContext, params: PartialResultParams): js.UndefOr[ResultProgress[R]] = js.native
  
  @JSImport("vscode-languageserver/lib/progress", "attachWorkDone")
  @js.native
  def attachWorkDone(connection: ProgressContext): WorkDoneProgress = js.native
  @JSImport("vscode-languageserver/lib/progress", "attachWorkDone")
  @js.native
  def attachWorkDone(connection: ProgressContext, params: WorkDoneProgressParams): WorkDoneProgress = js.native
  
  @js.native
  trait ProgressContext extends StObject {
    
    def sendProgress[P](`type`: ProgressType[P], token: ProgressToken, value: P): Unit = js.native
  }
  object ProgressContext {
    
    @scala.inline
    def apply(sendProgress: (ProgressType[js.Any], ProgressToken, js.Any) => Unit): ProgressContext = {
      val __obj = js.Dynamic.literal(sendProgress = js.Any.fromFunction3(sendProgress))
      __obj.asInstanceOf[ProgressContext]
    }
    
    @scala.inline
    implicit class ProgressContextMutableBuilder[Self <: ProgressContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSendProgress(value: (ProgressType[js.Any], ProgressToken, js.Any) => Unit): Self = StObject.set(x, "sendProgress", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait ResultProgress[R] extends StObject {
    
    def report(data: R): Unit = js.native
  }
  object ResultProgress {
    
    @scala.inline
    def apply[R](report: R => Unit): ResultProgress[R] = {
      val __obj = js.Dynamic.literal(report = js.Any.fromFunction1(report))
      __obj.asInstanceOf[ResultProgress[R]]
    }
    
    @scala.inline
    implicit class ResultProgressMutableBuilder[Self <: ResultProgress[_], R] (val x: Self with ResultProgress[R]) extends AnyVal {
      
      @scala.inline
      def setReport(value: R => Unit): Self = StObject.set(x, "report", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait WindowProgress extends StObject {
    
    def attachWorkDoneProgress(): WorkDoneProgress = js.native
    def attachWorkDoneProgress(token: ProgressToken): WorkDoneProgress = js.native
    
    def createWorkDoneProgress(): js.Promise[WorkDoneProgress] = js.native
  }
  
  @js.native
  trait WorkDoneProgress extends StObject {
    
    def begin(title: String): Unit = js.native
    def begin(
      title: String,
      percentage: js.UndefOr[scala.Nothing],
      message: js.UndefOr[scala.Nothing],
      cancellable: Boolean
    ): Unit = js.native
    def begin(title: String, percentage: js.UndefOr[scala.Nothing], message: String): Unit = js.native
    def begin(title: String, percentage: js.UndefOr[scala.Nothing], message: String, cancellable: Boolean): Unit = js.native
    def begin(title: String, percentage: Double): Unit = js.native
    def begin(title: String, percentage: Double, message: js.UndefOr[scala.Nothing], cancellable: Boolean): Unit = js.native
    def begin(title: String, percentage: Double, message: String): Unit = js.native
    def begin(title: String, percentage: Double, message: String, cancellable: Boolean): Unit = js.native
    
    def done(): Unit = js.native
    
    def report(message: String): Unit = js.native
    def report(percentage: Double): Unit = js.native
    def report(percentage: Double, message: String): Unit = js.native
    
    val token: CancellationToken = js.native
  }
}
