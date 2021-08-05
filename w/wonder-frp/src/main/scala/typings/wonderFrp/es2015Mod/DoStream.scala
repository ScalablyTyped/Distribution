package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "DoStream")
@js.native
class DoStream protected ()
  extends typings.wonderFrp.streamDoStreamMod.DoStream {
  def this(
    source: typings.wonderFrp.coreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ) = this()
}
/* static members */
object DoStream {
  
  @JSImport("wonder-frp/dist/es2015", "DoStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(source: typings.wonderFrp.coreStreamMod.Stream): typings.wonderFrp.streamDoStreamMod.DoStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.streamDoStreamMod.DoStream]
  inline def create(source: typings.wonderFrp.coreStreamMod.Stream, onNext: js.Function): typings.wonderFrp.streamDoStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.streamDoStreamMod.DoStream]
  inline def create(source: typings.wonderFrp.coreStreamMod.Stream, onNext: js.Function, onError: js.Function): typings.wonderFrp.streamDoStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.streamDoStreamMod.DoStream]
  inline def create(
    source: typings.wonderFrp.coreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ): typings.wonderFrp.streamDoStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.streamDoStreamMod.DoStream]
  inline def create(
    source: typings.wonderFrp.coreStreamMod.Stream,
    onNext: js.Function,
    onError: Unit,
    onCompleted: js.Function
  ): typings.wonderFrp.streamDoStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.streamDoStreamMod.DoStream]
  inline def create(source: typings.wonderFrp.coreStreamMod.Stream, onNext: Unit, onError: js.Function): typings.wonderFrp.streamDoStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.streamDoStreamMod.DoStream]
  inline def create(
    source: typings.wonderFrp.coreStreamMod.Stream,
    onNext: Unit,
    onError: js.Function,
    onCompleted: js.Function
  ): typings.wonderFrp.streamDoStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.streamDoStreamMod.DoStream]
  inline def create(
    source: typings.wonderFrp.coreStreamMod.Stream,
    onNext: Unit,
    onError: Unit,
    onCompleted: js.Function
  ): typings.wonderFrp.streamDoStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.streamDoStreamMod.DoStream]
}
