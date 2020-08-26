package typings.urqlCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.ASTNode
import typings.graphql.locationMod.SourceLocation
import typings.graphql.maybeMod.Maybe
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<graphql.graphql.GraphQLError> */
@js.native
trait PartialGraphQLError extends js.Object {
  var constructor: js.UndefOr[
    js.Function7[
      /* message */ String, 
      /* nodes */ js.UndefOr[Maybe[js.Array[ASTNode] | ASTNode]], 
      /* source */ js.UndefOr[Maybe[typings.graphql.sourceMod.Source]], 
      /* positions */ js.UndefOr[Maybe[js.Array[Double]]], 
      /* path */ js.UndefOr[Maybe[js.Array[String | Double]]], 
      /* originalError */ js.UndefOr[Maybe[Error]], 
      /* extensions */ js.UndefOr[Maybe[StringDictionary[_]]], 
      js.Any
    ]
  ] = js.native
  var extensions: js.UndefOr[StringDictionary[js.Any]] = js.native
  var locations: js.UndefOr[js.Array[SourceLocation]] = js.native
  var message: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var nodes: js.UndefOr[js.Array[ASTNode]] = js.native
  var originalError: js.UndefOr[Maybe[Error]] = js.native
  var path: js.UndefOr[js.Array[String | Double]] = js.native
  var positions: js.UndefOr[js.Array[Double]] = js.native
  var source: js.UndefOr[typings.graphql.sourceMod.Source] = js.native
  var stack: js.UndefOr[String] = js.native
}

object PartialGraphQLError {
  @scala.inline
  def apply(): PartialGraphQLError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGraphQLError]
  }
  @scala.inline
  implicit class PartialGraphQLErrorOps[Self <: PartialGraphQLError] (val x: Self) extends AnyVal {
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
    def setConstructor(
      value: (/* message */ String, /* nodes */ js.UndefOr[Maybe[js.Array[ASTNode] | ASTNode]], /* source */ js.UndefOr[Maybe[typings.graphql.sourceMod.Source]], /* positions */ js.UndefOr[Maybe[js.Array[Double]]], /* path */ js.UndefOr[Maybe[js.Array[String | Double]]], /* originalError */ js.UndefOr[Maybe[Error]], /* extensions */ js.UndefOr[Maybe[StringDictionary[_]]]) => js.Any
    ): Self = this.set("constructor", js.Any.fromFunction7(value))
    @scala.inline
    def deleteConstructor: Self = this.set("constructor", js.undefined)
    @scala.inline
    def setExtensions(value: StringDictionary[js.Any]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setLocationsVarargs(value: SourceLocation*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[SourceLocation]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNodesVarargs(value: ASTNode*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[ASTNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
    @scala.inline
    def setOriginalError(value: Maybe[Error]): Self = this.set("originalError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalError: Self = this.set("originalError", js.undefined)
    @scala.inline
    def setOriginalErrorNull: Self = this.set("originalError", null)
    @scala.inline
    def setPathVarargs(value: (String | Double)*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[String | Double]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPositionsVarargs(value: Double*): Self = this.set("positions", js.Array(value :_*))
    @scala.inline
    def setPositions(value: js.Array[Double]): Self = this.set("positions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositions: Self = this.set("positions", js.undefined)
    @scala.inline
    def setSource(value: typings.graphql.sourceMod.Source): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}

