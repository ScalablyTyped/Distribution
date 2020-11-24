package typings.typedGithubApi.interfacesIssueMod

import typings.typedGithubApi.interfacesRepositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssueRef extends js.Object {
  
  def loadAsync(): js.Promise[Issue | Null] = js.native
  
  def loadRepositoryAsync(): js.Promise[Repository] = js.native
  
  val number: Double = js.native
}
object IssueRef {
  
  @scala.inline
  def apply(
    loadAsync: () => js.Promise[Issue | Null],
    loadRepositoryAsync: () => js.Promise[Repository],
    number: Double
  ): IssueRef = {
    val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction0(loadAsync), loadRepositoryAsync = js.Any.fromFunction0(loadRepositoryAsync), number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueRef]
  }
  
  @scala.inline
  implicit class IssueRefOps[Self <: IssueRef] (val x: Self) extends AnyVal {
    
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
    def setLoadAsync(value: () => js.Promise[Issue | Null]): Self = this.set("loadAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadRepositoryAsync(value: () => js.Promise[Repository]): Self = this.set("loadRepositoryAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
  }
}
