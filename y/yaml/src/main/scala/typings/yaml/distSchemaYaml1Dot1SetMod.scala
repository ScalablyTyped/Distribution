package typings.yaml

import typings.yaml.anon.KeyT
import typings.yaml.distNodesScalarMod.Scalar
import typings.yaml.distNodesYamlmapMod.YAMLMap
import typings.yaml.distSchemaSchemaMod.Schema
import typings.yaml.distSchemaTypesMod.CollectionTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaYaml1Dot1SetMod {
  
  @JSImport("yaml/dist/schema/yaml-1.1/set", "YAMLSet")
  @js.native
  open class YAMLSet[T] () extends YAMLMap[T, Scalar[Null] | Null] {
    def this(schema: Schema) = this()
    
    def add(key: KeyT[T]): Unit = js.native
    
    def set(key: T, value: Boolean): Unit = js.native
    /** @deprecated Will throw; `value` must be boolean */
    def set(key: T, value: Null): Unit = js.native
  }
  /* static members */
  object YAMLSet {
    
    @JSImport("yaml/dist/schema/yaml-1.1/set", "YAMLSet")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yaml/dist/schema/yaml-1.1/set", "YAMLSet.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("yaml/dist/schema/yaml-1.1/set", "set")
  @js.native
  val set: CollectionTag = js.native
}
