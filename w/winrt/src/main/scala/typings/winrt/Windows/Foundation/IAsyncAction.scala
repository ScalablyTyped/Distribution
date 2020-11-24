package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAsyncAction extends IAsyncInfo {
  
  def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit = js.native
  @JSName("completed")
  var completed_Original: AsyncActionCompletedHandler = js.native
  
  var done: js.UndefOr[
    js.Function3[
      /* success */ js.UndefOr[js.Function0[_]], 
      /* error */ js.UndefOr[js.Function1[/* error */ js.Any, _]], 
      /* progress */ js.UndefOr[js.Function1[/* progress */ js.Any, Unit]], 
      Unit
    ]
  ] = js.native
  
  def getResults(): Unit = js.native
  
  def `then`[U](): js.Any = js.native
  def `then`[U](
    success: js.UndefOr[scala.Nothing],
    error: js.UndefOr[scala.Nothing],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): js.Any = js.native
  def `then`[U](
    success: js.UndefOr[scala.Nothing],
    error: js.Function1[
      /* error */ js.Any, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ _) | U
    ]
  ): js.Any = js.native
  def `then`[U](
    success: js.UndefOr[scala.Nothing],
    error: js.Function1[
      /* error */ js.Any, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ _) | U
    ],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): js.Any = js.native
  def `then`[U](
    success: js.Function0[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ _) | U
    ]
  ): js.Any = js.native
  def `then`[U](
    success: js.Function0[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ _) | U
    ],
    error: js.UndefOr[scala.Nothing],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): js.Any = js.native
  def `then`[U](
    success: js.Function0[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ _) | U
    ],
    error: js.Function1[
      /* error */ js.Any, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ _) | U
    ]
  ): js.Any = js.native
  def `then`[U](
    success: js.Function0[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ _) | U
    ],
    error: js.Function1[
      /* error */ js.Any, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ _) | U
    ],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): js.Any = js.native
}
