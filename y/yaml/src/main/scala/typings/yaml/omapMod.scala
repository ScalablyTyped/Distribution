package typings.yaml

import typings.yaml.anon.KeyValue
import typings.yaml.mod.Pair
import typings.yaml.typesMod.CollectionTag
import typings.yaml.yamlseqMod.YAMLSeq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object omapMod {
  
  @JSImport("yaml/dist/schema/yaml-1.1/omap", "YAMLOMap")
  @js.native
  open class YAMLOMap () extends YAMLSeq[Any] {
    
    def add(pair: KeyValue): Unit = js.native
    def add(pair: KeyValue, overwrite: Boolean): Unit = js.native
    def add(pair: Pair[Any, Any]): Unit = js.native
    def add(pair: Pair[Any, Any], overwrite: Boolean): Unit = js.native
  }
  /* static members */
  object YAMLOMap {
    
    @JSImport("yaml/dist/schema/yaml-1.1/omap", "YAMLOMap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yaml/dist/schema/yaml-1.1/omap", "YAMLOMap.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("yaml/dist/schema/yaml-1.1/omap", "omap")
  @js.native
  val omap: CollectionTag = js.native
}
