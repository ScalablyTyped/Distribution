package typings.yaml

import typings.yaml.anon.ScalarTagtestRegExp
import typings.yaml.distSchemaTypesMod.CollectionTag
import typings.yaml.distSchemaTypesMod.ScalarTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaTagsMod {
  
  @JSImport("yaml/dist/schema/tags", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object coreKnownTags {
    
    @JSImport("yaml/dist/schema/tags", "coreKnownTags")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yaml/dist/schema/tags", "coreKnownTags.tag:yaml.org,2002:binary")
    @js.native
    def tagYamlOrg2002Binary: ScalarTag = js.native
    
    inline def tagYamlOrg2002Binary_=(x: ScalarTag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag:yaml.org,2002:binary")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/schema/tags", "coreKnownTags.tag:yaml.org,2002:omap")
    @js.native
    def tagYamlOrg2002Omap: CollectionTag = js.native
    
    inline def tagYamlOrg2002Omap_=(x: CollectionTag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag:yaml.org,2002:omap")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/schema/tags", "coreKnownTags.tag:yaml.org,2002:pairs")
    @js.native
    def tagYamlOrg2002Pairs: CollectionTag = js.native
    
    inline def tagYamlOrg2002Pairs_=(x: CollectionTag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag:yaml.org,2002:pairs")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/schema/tags", "coreKnownTags.tag:yaml.org,2002:set")
    @js.native
    def tagYamlOrg2002Set: CollectionTag = js.native
    
    inline def tagYamlOrg2002Set_=(x: CollectionTag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag:yaml.org,2002:set")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/schema/tags", "coreKnownTags.tag:yaml.org,2002:timestamp")
    @js.native
    def tagYamlOrg2002Timestamp: ScalarTagtestRegExp = js.native
    
    inline def tagYamlOrg2002Timestamp_=(x: ScalarTagtestRegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag:yaml.org,2002:timestamp")(x.asInstanceOf[js.Any])
  }
  
  inline def getTags(customTags: js.UndefOr[Tags | (js.Function1[/* tags */ Tags, Tags]) | Null], schemaName: String): js.Array[ScalarTag | CollectionTag] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTags")(customTags.asInstanceOf[js.Any], schemaName.asInstanceOf[js.Any])).asInstanceOf[js.Array[ScalarTag | CollectionTag]]
  inline def getTags(customTags: Unit, schemaName: String): js.Array[ScalarTag | CollectionTag] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTags")(customTags.asInstanceOf[js.Any], schemaName.asInstanceOf[js.Any])).asInstanceOf[js.Array[ScalarTag | CollectionTag]]
  
  /* keyof yaml.anon.Binary */ /* Rewritten from type alias, can be one of: 
    - typings.yaml.yamlStrings.binary
    - typings.yaml.yamlStrings.bool
    - typings.yaml.yamlStrings.float
    - typings.yaml.yamlStrings.floatExp
    - typings.yaml.yamlStrings.floatNaN
    - typings.yaml.yamlStrings.floatTime
    - typings.yaml.yamlStrings.int
    - typings.yaml.yamlStrings.intHex
    - typings.yaml.yamlStrings.intOct
    - typings.yaml.yamlStrings.intTime
    - typings.yaml.yamlStrings.map
    - typings.yaml.yamlStrings.`null`
    - typings.yaml.yamlStrings.omap
    - typings.yaml.yamlStrings.pairs
    - typings.yaml.yamlStrings.seq
    - typings.yaml.yamlStrings.set
    - typings.yaml.yamlStrings.timestamp
  */
  trait TagId extends StObject
  
  type Tags = js.Array[ScalarTag | CollectionTag | TagId]
}
