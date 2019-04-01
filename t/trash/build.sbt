organization := "org.scalablytyped"
name := "trash"
version := "5.1.0-09069a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-306649",
  "org.scalablytyped" %%% "cp-file" % "6.1.0-a52b25",
  "org.scalablytyped" %%% "dir-glob" % "2.0-dt-20181212Z-a8a63d",
  "org.scalablytyped" %%% "fast-glob" % "2.2.6-db9e47",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-8bb714",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20190329Z-819655",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-95102e",
  "org.scalablytyped" %%% "globby" % "9.1.0-fabebd",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20190212Z-fcf64f",
  "org.scalablytyped" %%% "ignore" % "3.3.10-4b81ac",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20190329Z-4226a6",
  "org.scalablytyped" %%% "make-dir" % "2.1.0-775f33",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-5870cb",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-64a8b0",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "move-file" % "1.1.0-c2435b",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-90e988",
  "org.scalablytyped" %%% "nested-error-stacks" % "2.1-dt-20180828Z-87d30a",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-807234",
  "org.scalablytyped" %%% "p-map" % "2.0.0-cc43fc",
  "org.scalablytyped" %%% "p-try" % "2.0-dt-20180621Z-71f17a",
  "org.scalablytyped" %%% "path-exists" % "3.0-dt-20180214Z-3b459a",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20190322Z-6f182f",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-195cbe",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6adbd7",
  "org.scalablytyped" %%% "slash" % "2.0-dt-20181224Z-a5cb3a",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-6fb7ef")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        