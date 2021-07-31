package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MetaGraphDef {
  
  /** Properties of a MetaInfoDef. */
  trait IMetaInfoDef extends StObject {
    
    /** MetaInfoDef anyInfo */
    var anyInfo: js.UndefOr[IAny | Null] = js.undefined
    
    /** MetaInfoDef metaGraphVersion */
    var metaGraphVersion: js.UndefOr[String | Null] = js.undefined
    
    /** MetaInfoDef strippedOpList */
    var strippedOpList: js.UndefOr[IOpList | Null] = js.undefined
    
    /** MetaInfoDef tags */
    var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /** MetaInfoDef tensorflowGitVersion */
    var tensorflowGitVersion: js.UndefOr[String | Null] = js.undefined
    
    /** MetaInfoDef tensorflowVersion */
    var tensorflowVersion: js.UndefOr[String | Null] = js.undefined
  }
  object IMetaInfoDef {
    
    @scala.inline
    def apply(): IMetaInfoDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMetaInfoDef]
    }
    
    @scala.inline
    implicit class IMetaInfoDefMutableBuilder[Self <: IMetaInfoDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnyInfo(value: IAny): Self = StObject.set(x, "anyInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnyInfoNull: Self = StObject.set(x, "anyInfo", null)
      
      @scala.inline
      def setAnyInfoUndefined: Self = StObject.set(x, "anyInfo", js.undefined)
      
      @scala.inline
      def setMetaGraphVersion(value: String): Self = StObject.set(x, "metaGraphVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaGraphVersionNull: Self = StObject.set(x, "metaGraphVersion", null)
      
      @scala.inline
      def setMetaGraphVersionUndefined: Self = StObject.set(x, "metaGraphVersion", js.undefined)
      
      @scala.inline
      def setStrippedOpList(value: IOpList): Self = StObject.set(x, "strippedOpList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrippedOpListNull: Self = StObject.set(x, "strippedOpList", null)
      
      @scala.inline
      def setStrippedOpListUndefined: Self = StObject.set(x, "strippedOpList", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsNull: Self = StObject.set(x, "tags", null)
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setTensorflowGitVersion(value: String): Self = StObject.set(x, "tensorflowGitVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTensorflowGitVersionNull: Self = StObject.set(x, "tensorflowGitVersion", null)
      
      @scala.inline
      def setTensorflowGitVersionUndefined: Self = StObject.set(x, "tensorflowGitVersion", js.undefined)
      
      @scala.inline
      def setTensorflowVersion(value: String): Self = StObject.set(x, "tensorflowVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTensorflowVersionNull: Self = StObject.set(x, "tensorflowVersion", null)
      
      @scala.inline
      def setTensorflowVersionUndefined: Self = StObject.set(x, "tensorflowVersion", js.undefined)
    }
  }
}
