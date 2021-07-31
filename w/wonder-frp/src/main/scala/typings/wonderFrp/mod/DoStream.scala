package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "DoStream")
@js.native
class DoStream protected ()
  extends typings.wonderFrp.doStreamMod.DoStream {
  def this(
    source: typings.wonderFrp.streamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ) = this()
}
/* static members */
object DoStream {
  
  @JSImport("wonder-frp/dist/commonjs", "DoStream")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(source: typings.wonderFrp.streamMod.Stream): typings.wonderFrp.doStreamMod.DoStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.doStreamMod.DoStream]
  @scala.inline
  def create(source: typings.wonderFrp.streamMod.Stream, onNext: js.Function): typings.wonderFrp.doStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.doStreamMod.DoStream]
  @scala.inline
  def create(source: typings.wonderFrp.streamMod.Stream, onNext: js.Function, onError: js.Function): typings.wonderFrp.doStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.doStreamMod.DoStream]
  @scala.inline
  def create(
    source: typings.wonderFrp.streamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ): typings.wonderFrp.doStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.doStreamMod.DoStream]
  @scala.inline
  def create(
    source: typings.wonderFrp.streamMod.Stream,
    onNext: js.Function,
    onError: Unit,
    onCompleted: js.Function
  ): typings.wonderFrp.doStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.doStreamMod.DoStream]
  @scala.inline
  def create(source: typings.wonderFrp.streamMod.Stream, onNext: Unit, onError: js.Function): typings.wonderFrp.doStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.doStreamMod.DoStream]
  @scala.inline
  def create(
    source: typings.wonderFrp.streamMod.Stream,
    onNext: Unit,
    onError: js.Function,
    onCompleted: js.Function
  ): typings.wonderFrp.doStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.doStreamMod.DoStream]
  @scala.inline
  def create(source: typings.wonderFrp.streamMod.Stream, onNext: Unit, onError: Unit, onCompleted: js.Function): typings.wonderFrp.doStreamMod.DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.doStreamMod.DoStream]
}
