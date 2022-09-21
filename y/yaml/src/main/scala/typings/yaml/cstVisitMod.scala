package typings.yaml

import typings.yaml.cstMod.BlockMap
import typings.yaml.cstMod.BlockSequence
import typings.yaml.cstMod.CollectionItem
import typings.yaml.cstMod.Document
import typings.yaml.cstMod.FlowCollection
import typings.yaml.yamlStrings.key
import typings.yaml.yamlStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cstVisitMod {
  
  object visit {
    
    inline def apply(cst: CollectionItem, visitor: Visitor): Unit = (^.asInstanceOf[js.Dynamic].apply(cst.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(cst: Document, visitor: Visitor): Unit = (^.asInstanceOf[js.Dynamic].apply(cst.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("yaml/dist/parse/cst-visit", "visit")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yaml/dist/parse/cst-visit", "visit.BREAK")
    @js.native
    def BREAK: js.Symbol = js.native
    inline def BREAK_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BREAK")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/parse/cst-visit", "visit.REMOVE")
    @js.native
    def REMOVE: js.Symbol = js.native
    inline def REMOVE_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVE")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/parse/cst-visit", "visit.SKIP")
    @js.native
    def SKIP: js.Symbol = js.native
    inline def SKIP_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SKIP")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/parse/cst-visit", "visit.itemAtPath")
    @js.native
    def itemAtPath: js.Function2[
        /* cst */ Document | CollectionItem, 
        /* path */ VisitPath, 
        js.UndefOr[CollectionItem]
      ] = js.native
    inline def itemAtPath_=(
      x: js.Function2[
          /* cst */ Document | CollectionItem, 
          /* path */ VisitPath, 
          js.UndefOr[CollectionItem]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemAtPath")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/parse/cst-visit", "visit.parentCollection")
    @js.native
    def parentCollection: js.Function2[
        /* cst */ Document | CollectionItem, 
        /* path */ VisitPath, 
        BlockMap | BlockSequence | FlowCollection
      ] = js.native
    inline def parentCollection_=(
      x: js.Function2[
          /* cst */ Document | CollectionItem, 
          /* path */ VisitPath, 
          BlockMap | BlockSequence | FlowCollection
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentCollection")(x.asInstanceOf[js.Any])
  }
  
  type VisitPath = js.Array[js.Tuple2[key | value, Double]]
  
  @js.native
  trait Visitor extends StObject {
    
    def apply(item: CollectionItem, path: VisitPath): Double | js.Symbol | Visitor | Unit = js.native
  }
}
