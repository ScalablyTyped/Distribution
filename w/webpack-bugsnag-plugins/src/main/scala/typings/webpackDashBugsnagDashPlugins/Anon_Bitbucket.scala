package typings.webpackDashBugsnagDashPlugins

import typings.webpackDashBugsnagDashPlugins.webpackDashBugsnagDashPluginsStrings.`bitbucket-server`
import typings.webpackDashBugsnagDashPlugins.webpackDashBugsnagDashPluginsStrings.`github-enterprise`
import typings.webpackDashBugsnagDashPlugins.webpackDashBugsnagDashPluginsStrings.`gitlab-onpremise`
import typings.webpackDashBugsnagDashPlugins.webpackDashBugsnagDashPluginsStrings.bitbucket
import typings.webpackDashBugsnagDashPlugins.webpackDashBugsnagDashPluginsStrings.github
import typings.webpackDashBugsnagDashPlugins.webpackDashBugsnagDashPluginsStrings.gitlab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bitbucket extends js.Object {
  /**
    *  The source control provider.
    */
  var provider: github | `github-enterprise` | gitlab | `gitlab-onpremise` | bitbucket | `bitbucket-server`
  /**
    * A URL (git/ssh/https) pointing to the repository, or webpage representing
    * the repository
    */
  var repository: String
  /**
    * The unique identifier for the commit (e.g. git SHA)
    */
  var revision: String
}

object Anon_Bitbucket {
  @scala.inline
  def apply(
    provider: github | `github-enterprise` | gitlab | `gitlab-onpremise` | bitbucket | `bitbucket-server`,
    repository: String,
    revision: String
  ): Anon_Bitbucket = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], repository = repository, revision = revision)
  
    __obj.asInstanceOf[Anon_Bitbucket]
  }
}

