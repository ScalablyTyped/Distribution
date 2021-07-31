package typings.wonderFrp

import typings.wonderFrp.coreStreamMod.Stream
import typings.wonderFrp.streamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamDoStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/DoStream", "DoStream")
  @js.native
  class DoStream protected () extends BaseStream {
    def this(source: Stream, onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
    
    var _observer: js.Any = js.native
    
    var _source: js.Any = js.native
  }
  /* static members */
  object DoStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/DoStream", "DoStream")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(source: Stream): DoStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[DoStream]
    @scala.inline
    def create(source: Stream, onNext: js.Function): DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[DoStream]
    @scala.inline
    def create(source: Stream, onNext: js.Function, onError: js.Function): DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[DoStream]
    @scala.inline
    def create(source: Stream, onNext: js.Function, onError: js.Function, onCompleted: js.Function): DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[DoStream]
    @scala.inline
    def create(source: Stream, onNext: js.Function, onError: Unit, onCompleted: js.Function): DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[DoStream]
    @scala.inline
    def create(source: Stream, onNext: Unit, onError: js.Function): DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[DoStream]
    @scala.inline
    def create(source: Stream, onNext: Unit, onError: js.Function, onCompleted: js.Function): DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[DoStream]
    @scala.inline
    def create(source: Stream, onNext: Unit, onError: Unit, onCompleted: js.Function): DoStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompleted.asInstanceOf[js.Any])).asInstanceOf[DoStream]
  }
}
