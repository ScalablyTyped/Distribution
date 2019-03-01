package typings
package typedDashGithubDashApiLib.distApiDashInterfacesRepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repository extends js.Object {
  var allow_merge_commit: scala.Boolean
  var allow_rebase_merge: scala.Boolean
  var allow_squash_merge: scala.Boolean
  var archive_url: java.lang.String
  var assignees_url: java.lang.String
  var blobs_url: java.lang.String
  var branches_url: java.lang.String
  var clone_url: java.lang.String
  var collaborators_url: java.lang.String
  var comments_url: java.lang.String
  var commits_url: java.lang.String
  var compare_url: java.lang.String
  var contents_url: java.lang.String
  var contributors_url: java.lang.String
  var created_at: stdLib.Date
  var default_branch: java.lang.String
  var deployments_url: java.lang.String
  var description: java.lang.String
  var downloads_url: java.lang.String
  var events_url: java.lang.String
  var fork: scala.Boolean
  var forks_count: scala.Double
  var forks_url: java.lang.String
  var full_name: java.lang.String
  var git_commits_url: java.lang.String
  var git_refs_url: java.lang.String
  var git_tags_url: java.lang.String
  var git_url: java.lang.String
  var has_downloads: scala.Boolean
  var has_issues: scala.Boolean
  var has_pages: scala.Boolean
  var has_wiki: scala.Boolean
  var homepage: java.lang.String
  var hooks_url: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var issue_comment_url: java.lang.String
  var issue_events_url: java.lang.String
  var issues_url: java.lang.String
  var keys_url: java.lang.String
  var labels_url: java.lang.String
  var language: java.lang.String | scala.Null
  var languages_url: java.lang.String
  var merges_url: java.lang.String
  var milestones_url: java.lang.String
  var mirror_url: java.lang.String
  var name: java.lang.String
  var network_count: scala.Double
  var notifications_url: java.lang.String
  var open_issues_count: scala.Double
  var owner: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary
  var permissions: typedDashGithubDashApiLib.Anon_Admin
  var `private`: scala.Boolean
  var pulls_url: java.lang.String
  var pushed_at: stdLib.Date
  var releases_url: java.lang.String
  var size: scala.Double
  var ssh_url: java.lang.String
  var stargazers_count: scala.Double
  var stargazers_url: java.lang.String
  var statuses_url: java.lang.String
  var subscribers_count: scala.Double
  var subscribers_url: java.lang.String
  var subscription_url: java.lang.String
  var svn_url: java.lang.String
  var tags_url: java.lang.String
  var teams_url: java.lang.String
  var topics: js.Array[java.lang.String]
  var trees_url: java.lang.String
  var updated_at: stdLib.Date
  var url: java.lang.String
  var watchers_count: scala.Double
}

object Repository {
  @scala.inline
  def apply(
    allow_merge_commit: scala.Boolean,
    allow_rebase_merge: scala.Boolean,
    allow_squash_merge: scala.Boolean,
    archive_url: java.lang.String,
    assignees_url: java.lang.String,
    blobs_url: java.lang.String,
    branches_url: java.lang.String,
    clone_url: java.lang.String,
    collaborators_url: java.lang.String,
    comments_url: java.lang.String,
    commits_url: java.lang.String,
    compare_url: java.lang.String,
    contents_url: java.lang.String,
    contributors_url: java.lang.String,
    created_at: stdLib.Date,
    default_branch: java.lang.String,
    deployments_url: java.lang.String,
    description: java.lang.String,
    downloads_url: java.lang.String,
    events_url: java.lang.String,
    fork: scala.Boolean,
    forks_count: scala.Double,
    forks_url: java.lang.String,
    full_name: java.lang.String,
    git_commits_url: java.lang.String,
    git_refs_url: java.lang.String,
    git_tags_url: java.lang.String,
    git_url: java.lang.String,
    has_downloads: scala.Boolean,
    has_issues: scala.Boolean,
    has_pages: scala.Boolean,
    has_wiki: scala.Boolean,
    homepage: java.lang.String,
    hooks_url: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    issue_comment_url: java.lang.String,
    issue_events_url: java.lang.String,
    issues_url: java.lang.String,
    keys_url: java.lang.String,
    labels_url: java.lang.String,
    languages_url: java.lang.String,
    merges_url: java.lang.String,
    milestones_url: java.lang.String,
    mirror_url: java.lang.String,
    name: java.lang.String,
    network_count: scala.Double,
    notifications_url: java.lang.String,
    open_issues_count: scala.Double,
    owner: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary,
    permissions: typedDashGithubDashApiLib.Anon_Admin,
    `private`: scala.Boolean,
    pulls_url: java.lang.String,
    pushed_at: stdLib.Date,
    releases_url: java.lang.String,
    size: scala.Double,
    ssh_url: java.lang.String,
    stargazers_count: scala.Double,
    stargazers_url: java.lang.String,
    statuses_url: java.lang.String,
    subscribers_count: scala.Double,
    subscribers_url: java.lang.String,
    subscription_url: java.lang.String,
    svn_url: java.lang.String,
    tags_url: java.lang.String,
    teams_url: java.lang.String,
    topics: js.Array[java.lang.String],
    trees_url: java.lang.String,
    updated_at: stdLib.Date,
    url: java.lang.String,
    watchers_count: scala.Double,
    language: java.lang.String = null
  ): Repository = {
    val __obj = js.Dynamic.literal(`private` = `private`)
    __obj.updateDynamic("allow_merge_commit")(allow_merge_commit)
    __obj.updateDynamic("allow_rebase_merge")(allow_rebase_merge)
    __obj.updateDynamic("allow_squash_merge")(allow_squash_merge)
    __obj.updateDynamic("archive_url")(archive_url)
    __obj.updateDynamic("assignees_url")(assignees_url)
    __obj.updateDynamic("blobs_url")(blobs_url)
    __obj.updateDynamic("branches_url")(branches_url)
    __obj.updateDynamic("clone_url")(clone_url)
    __obj.updateDynamic("collaborators_url")(collaborators_url)
    __obj.updateDynamic("comments_url")(comments_url)
    __obj.updateDynamic("commits_url")(commits_url)
    __obj.updateDynamic("compare_url")(compare_url)
    __obj.updateDynamic("contents_url")(contents_url)
    __obj.updateDynamic("contributors_url")(contributors_url)
    __obj.updateDynamic("created_at")(created_at)
    __obj.updateDynamic("default_branch")(default_branch)
    __obj.updateDynamic("deployments_url")(deployments_url)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("downloads_url")(downloads_url)
    __obj.updateDynamic("events_url")(events_url)
    __obj.updateDynamic("fork")(fork)
    __obj.updateDynamic("forks_count")(forks_count)
    __obj.updateDynamic("forks_url")(forks_url)
    __obj.updateDynamic("full_name")(full_name)
    __obj.updateDynamic("git_commits_url")(git_commits_url)
    __obj.updateDynamic("git_refs_url")(git_refs_url)
    __obj.updateDynamic("git_tags_url")(git_tags_url)
    __obj.updateDynamic("git_url")(git_url)
    __obj.updateDynamic("has_downloads")(has_downloads)
    __obj.updateDynamic("has_issues")(has_issues)
    __obj.updateDynamic("has_pages")(has_pages)
    __obj.updateDynamic("has_wiki")(has_wiki)
    __obj.updateDynamic("homepage")(homepage)
    __obj.updateDynamic("hooks_url")(hooks_url)
    __obj.updateDynamic("html_url")(html_url)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("issue_comment_url")(issue_comment_url)
    __obj.updateDynamic("issue_events_url")(issue_events_url)
    __obj.updateDynamic("issues_url")(issues_url)
    __obj.updateDynamic("keys_url")(keys_url)
    __obj.updateDynamic("labels_url")(labels_url)
    __obj.updateDynamic("languages_url")(languages_url)
    __obj.updateDynamic("merges_url")(merges_url)
    __obj.updateDynamic("milestones_url")(milestones_url)
    __obj.updateDynamic("mirror_url")(mirror_url)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("network_count")(network_count)
    __obj.updateDynamic("notifications_url")(notifications_url)
    __obj.updateDynamic("open_issues_count")(open_issues_count)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("permissions")(permissions)
    __obj.updateDynamic("pulls_url")(pulls_url)
    __obj.updateDynamic("pushed_at")(pushed_at)
    __obj.updateDynamic("releases_url")(releases_url)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("ssh_url")(ssh_url)
    __obj.updateDynamic("stargazers_count")(stargazers_count)
    __obj.updateDynamic("stargazers_url")(stargazers_url)
    __obj.updateDynamic("statuses_url")(statuses_url)
    __obj.updateDynamic("subscribers_count")(subscribers_count)
    __obj.updateDynamic("subscribers_url")(subscribers_url)
    __obj.updateDynamic("subscription_url")(subscription_url)
    __obj.updateDynamic("svn_url")(svn_url)
    __obj.updateDynamic("tags_url")(tags_url)
    __obj.updateDynamic("teams_url")(teams_url)
    __obj.updateDynamic("topics")(topics)
    __obj.updateDynamic("trees_url")(trees_url)
    __obj.updateDynamic("updated_at")(updated_at)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("watchers_count")(watchers_count)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[Repository]
  }
}

