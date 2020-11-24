package typings.webpack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Basename extends js.Object {
  
  var basename: String = js.native
  
  var chunk: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Chunk */ js.Any = js.native
  
  var filename: String = js.native
  
  var hash: String = js.native
  
  var query: String = js.native
}
object Basename {
  
  @scala.inline
  def apply(
    basename: String,
    chunk: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Chunk */ js.Any,
    filename: String,
    hash: String,
    query: String
  ): Basename = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], chunk = chunk.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basename]
  }
  
  @scala.inline
  implicit class BasenameOps[Self <: Basename] (val x: Self) extends AnyVal {
    
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
    def setBasename(value: String): Self = this.set("basename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunk(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Chunk */ js.Any
    ): Self = this.set("chunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
  }
}
