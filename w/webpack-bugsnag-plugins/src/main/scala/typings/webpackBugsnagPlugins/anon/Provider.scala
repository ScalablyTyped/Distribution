package typings.webpackBugsnagPlugins.anon

import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.`bitbucket-server`
import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.`github-enterprise`
import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.`gitlab-onpremise`
import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.bitbucket
import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.github
import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.gitlab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Provider extends js.Object {
  /**
    *  The source control provider.
    */
  var provider: github | `github-enterprise` | gitlab | `gitlab-onpremise` | bitbucket | `bitbucket-server` = js.native
  /**
    * A URL (git/ssh/https) pointing to the repository, or webpage representing
    * the repository
    */
  var repository: String = js.native
  /**
    * The unique identifier for the commit (e.g. git SHA)
    */
  var revision: String = js.native
}

object Provider {
  @scala.inline
  def apply(
    provider: github | `github-enterprise` | gitlab | `gitlab-onpremise` | bitbucket | `bitbucket-server`,
    repository: String,
    revision: String
  ): Provider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
  @scala.inline
  implicit class ProviderOps[Self <: Provider] (val x: Self) extends AnyVal {
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
    def setProvider(value: github | `github-enterprise` | gitlab | `gitlab-onpremise` | bitbucket | `bitbucket-server`): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository(value: String): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: String): Self = this.set("revision", value.asInstanceOf[js.Any])
  }
  
}

