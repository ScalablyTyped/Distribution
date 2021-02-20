package typings.typeorm

import typings.typeorm.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataUtilsMod {
  
  @JSImport("typeorm/browser/metadata-builder/MetadataUtils", "MetadataUtils")
  @js.native
  class MetadataUtils () extends StObject
  /* static members */
  object MetadataUtils {
    
    /**
      * Filters given array of targets by a given classes.
      * If classes are not given, then it returns array itself.
      */
    @JSImport("typeorm/browser/metadata-builder/MetadataUtils", "MetadataUtils.filterByTarget")
    @js.native
    def filterByTarget[T /* <: `3` */](array: js.Array[T]): js.Array[T] = js.native
    @JSImport("typeorm/browser/metadata-builder/MetadataUtils", "MetadataUtils.filterByTarget")
    @js.native
    def filterByTarget[T /* <: `3` */](array: js.Array[T], classes: js.Array[_]): js.Array[T] = js.native
    
    /**
      * Gets given's entity all inherited classes.
      * Gives in order from parents to children.
      * For example Post extends ContentModel which extends Unit it will give
      * [Unit, ContentModel, Post]
      */
    @JSImport("typeorm/browser/metadata-builder/MetadataUtils", "MetadataUtils.getInheritanceTree")
    @js.native
    def getInheritanceTree(entity: js.Function): js.Array[js.Function] = js.native
    
    /**
      * Checks if this table is inherited from another table.
      */
    @JSImport("typeorm/browser/metadata-builder/MetadataUtils", "MetadataUtils.isInherited")
    @js.native
    def isInherited(target1: js.Function, target2: js.Function): Boolean = js.native
  }
}
