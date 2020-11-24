package typings.typeorm

import typings.typeorm.anon.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/metadata-builder/MetadataUtils", JSImport.Namespace)
@js.native
object metadataUtilsMod extends js.Object {
  
  @js.native
  class MetadataUtils () extends js.Object
  /* static members */
  @js.native
  object MetadataUtils extends js.Object {
    
    /**
      * Filters given array of targets by a given classes.
      * If classes are not given, then it returns array itself.
      */
    def filterByTarget[T /* <: `3` */](array: js.Array[T]): js.Array[T] = js.native
    def filterByTarget[T /* <: `3` */](array: js.Array[T], classes: js.Array[_]): js.Array[T] = js.native
    
    /**
      * Gets given's entity all inherited classes.
      * Gives in order from parents to children.
      * For example Post extends ContentModel which extends Unit it will give
      * [Unit, ContentModel, Post]
      */
    def getInheritanceTree(entity: js.Function): js.Array[js.Function] = js.native
    
    /**
      * Checks if this table is inherited from another table.
      */
    def isInherited(target1: js.Function, target2: js.Function): Boolean = js.native
  }
}
