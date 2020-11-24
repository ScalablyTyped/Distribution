package typings.swaggerSchemaOfficial.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spec extends js.Object {
  
  var basePath: js.UndefOr[String] = js.native
  
  var consumes: js.UndefOr[js.Array[String]] = js.native
  
  var definitions: js.UndefOr[StringDictionary[Schema]] = js.native
  
  var externalDocs: js.UndefOr[ExternalDocs] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var info: Info = js.native
  
  var parameters: js.UndefOr[StringDictionary[BodyParameter | QueryParameter]] = js.native
  
  var paths: StringDictionary[Path] = js.native
  
  var produces: js.UndefOr[js.Array[String]] = js.native
  
  var responses: js.UndefOr[StringDictionary[Response]] = js.native
  
  var schemes: js.UndefOr[js.Array[String]] = js.native
  
  var security: js.UndefOr[js.Array[StringDictionary[js.Array[String]]]] = js.native
  
  var securityDefinitions: js.UndefOr[StringDictionary[Security]] = js.native
  
  var swagger: String = js.native
  
  var tags: js.UndefOr[js.Array[Tag]] = js.native
}
object Spec {
  
  @scala.inline
  def apply(info: Info, paths: StringDictionary[Path], swagger: String): Spec = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], swagger = swagger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spec]
  }
  
  @scala.inline
  implicit class SpecOps[Self <: Spec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInfo(value: Info): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaths(value: StringDictionary[Path]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwagger(value: String): Self = this.set("swagger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    
    @scala.inline
    def setConsumesVarargs(value: String*): Self = this.set("consumes", js.Array(value :_*))
    
    @scala.inline
    def setConsumes(value: js.Array[String]): Self = this.set("consumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumes: Self = this.set("consumes", js.undefined)
    
    @scala.inline
    def setDefinitions(value: StringDictionary[Schema]): Self = this.set("definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinitions: Self = this.set("definitions", js.undefined)
    
    @scala.inline
    def setExternalDocs(value: ExternalDocs): Self = this.set("externalDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalDocs: Self = this.set("externalDocs", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setParameters(value: StringDictionary[BodyParameter | QueryParameter]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setProducesVarargs(value: String*): Self = this.set("produces", js.Array(value :_*))
    
    @scala.inline
    def setProduces(value: js.Array[String]): Self = this.set("produces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduces: Self = this.set("produces", js.undefined)
    
    @scala.inline
    def setResponses(value: StringDictionary[Response]): Self = this.set("responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponses: Self = this.set("responses", js.undefined)
    
    @scala.inline
    def setSchemesVarargs(value: String*): Self = this.set("schemes", js.Array(value :_*))
    
    @scala.inline
    def setSchemes(value: js.Array[String]): Self = this.set("schemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemes: Self = this.set("schemes", js.undefined)
    
    @scala.inline
    def setSecurityVarargs(value: StringDictionary[js.Array[String]]*): Self = this.set("security", js.Array(value :_*))
    
    @scala.inline
    def setSecurity(value: js.Array[StringDictionary[js.Array[String]]]): Self = this.set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    
    @scala.inline
    def setSecurityDefinitions(value: StringDictionary[Security]): Self = this.set("securityDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityDefinitions: Self = this.set("securityDefinitions", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
