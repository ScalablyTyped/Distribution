package typings.typeorm

import typings.typeorm.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataUtilsMod {
  
  @JSImport("typeorm/browser/metadata-builder/MetadataUtils", "MetadataUtils")
  @js.native
  class MetadataUtils () extends StObject
  /* static members */
  object MetadataUtils {
    
    @JSImport("typeorm/browser/metadata-builder/MetadataUtils", "MetadataUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Filters given array of targets by a given classes.
      * If classes are not given, then it returns array itself.
      */
    @scala.inline
    def filterByTarget[T /* <: `3` */](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterByTarget")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    @scala.inline
    def filterByTarget[T /* <: `3` */](array: js.Array[T], classes: js.Array[js.Any]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterByTarget")(array.asInstanceOf[js.Any], classes.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    /**
      * Gets given's entity all inherited classes.
      * Gives in order from parents to children.
      * For example Post extends ContentModel which extends Unit it will give
      * [Unit, ContentModel, Post]
      */
    @scala.inline
    def getInheritanceTree(entity: js.Function): js.Array[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInheritanceTree")(entity.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Function]]
    
    /**
      * Checks if this table is inherited from another table.
      */
    @scala.inline
    def isInherited(target1: js.Function, target2: js.Function): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInherited")(target1.asInstanceOf[js.Any], target2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
