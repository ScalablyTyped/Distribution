package typings.wepy

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("wepy/component", JSImport.Default)
  @js.native
  class default () extends component
  
  @js.native
  trait component extends StObject {
    
    @JSName("$apply")
    def $apply(fn: js.Function0[Unit]): Unit = js.native
    
    @JSName("$getComponent")
    def $getComponent(com_ : js.Any): js.Any = js.native
    
    @JSName("$init")
    def $init($wxpage: js.Any, $root: js.Any, $parent: js.Any): Unit = js.native
    
    @JSName("$initMixins")
    def $initMixins(): Unit = js.native
    
    @JSName("$isComponent")
    var $isComponent: Boolean = js.native
    
    @JSName("$nextTick")
    def $nextTick(fn: js.Function0[Unit]): Unit = js.native
    
    @JSName("$prefix")
    var $prefix: String = js.native
    
    @JSName("$setIndex")
    def $setIndex(index: Double): Unit = js.native
    
    var computed: js.UndefOr[StringDictionary[js.Function1[/* self */ js.UndefOr[component], _]]] = js.native
    
    var data: StringDictionary[js.Any] = js.native
    
    def getWxPage(): js.Any = js.native
    
    var methods: js.UndefOr[
        StringDictionary[js.Function1[/* evt */ js.UndefOr[typings.wepy.eventMod.default], _]]
      ] = js.native
    
    def onLoad(): Unit = js.native
    
    def setData(k: String, v: js.Any): Unit = js.native
    def setData(k: js.Array[String], v: js.Any): Unit = js.native
  }
}
